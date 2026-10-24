package org.telegram.messenger.camera;

import android.graphics.SurfaceTexture;
import gi.g4;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.wt;
import org.telegram.ui.ey;
import org.telegram.ui.q00;
public final class i implements Runnable {
    public final int f18118a;
    public final Object f18119b;
    public final Object f18120c;
    public final Object d;
    public final Object e;

    public i(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18118a = i10;
        this.f18120c = obj;
        this.f18119b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        kz kzVar = (kz) this.f18120c;
        TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.d;
        TLObject tLObject = (TLObject) this.e;
        Runnable runnable = (Runnable) this.f18119b;
        ArrayList arrayList = kzVar.f28103s;
        mz mzVar = kzVar.f28104w;
        if (mzVar.M != kzVar.f28098b) {
            return;
        }
        mzVar.L = 0;
        if (tL_messages_getStickers.emoticon.equals(kzVar.f28097a)) {
            if (!(tLObject instanceof TLRPC.TL_messages_stickers)) {
                runnable.run();
                return;
            }
            TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
            int size = arrayList.size();
            int size2 = tL_messages_stickers.stickers.size();
            for (int i10 = 0; i10 < size2; i10++) {
                TLRPC.Document document = tL_messages_stickers.stickers.get(i10);
                if (kzVar.v.indexOfKey(document.f20350id) < 0) {
                    arrayList.add(document);
                }
            }
            if (size != arrayList.size()) {
                kzVar.f28100f.put(arrayList, mzVar.N);
                if (size == 0) {
                    kzVar.h.add(arrayList);
                }
            }
        }
        runnable.run();
    }

    private final void b() {
        i10 i10Var = (i10) this.f18120c;
        TLObject tLObject = (TLObject) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        int i10 = -1;
        i10Var.f27246z0 = -1;
        o2 o2Var = i10Var.f33212n;
        q00.r0((TLRPC.TL_error) this.f18119b, o2Var, vc.a0(o2Var));
        int i11 = 0;
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.Updates) {
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                ArrayList<TLRPC.Update> arrayList = updates.updates;
                if (arrayList.isEmpty()) {
                    TLRPC.Update update = updates.update;
                    if (update instanceof TL_update.TL_updateDialogFilter) {
                        i10 = ((TL_update.TL_updateDialogFilter) update).f20596id;
                    }
                } else {
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        } else if (arrayList.get(i11) instanceof TL_update.TL_updateDialogFilter) {
                            i10 = ((TL_update.TL_updateDialogFilter) arrayList.get(i11)).f20596id;
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
            }
            if (i10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                o2Var.getMessagesController().loadRemoteFilters(true, new g4(i10Var, callback, i10, 4));
                return;
            }
            if (i10Var.f27222a0 != null) {
                o2Var.getMessagesController().checkChatlistFolderUpdate(i10Var.Y, true);
            }
            i10Var.A0 = true;
            i10Var.dismiss();
            callback.run(Integer.valueOf(i10));
            return;
        }
        i10Var.f27233l0.a(false);
    }

    private final void c() {
        ((ey) this.f18120c).u4(((Integer) this.f18119b).intValue());
        AndroidUtilities.runOnUIThread(new wt(12, (oy) this.d, (o2) this.e), 200L);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.i.run():void");
    }

    public i(Runnable runnable, CameraSession cameraSession, CountDownLatch countDownLatch, Runnable runnable2) {
        this.f18118a = 1;
        this.f18119b = runnable;
        this.f18120c = cameraSession;
        this.e = countDownLatch;
        this.d = runnable2;
    }

    public i(CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        this.f18118a = 0;
        this.f18120c = cameraSession;
        this.f18119b = runnable;
        this.e = surfaceTexture;
        this.d = runnable2;
    }

    public i(kz kzVar, TLRPC.TL_messages_getStickers tL_messages_getStickers, TLObject tLObject, Runnable runnable) {
        this.f18118a = 25;
        this.f18120c = kzVar;
        this.d = tL_messages_getStickers;
        this.e = tLObject;
        this.f18119b = runnable;
    }
}

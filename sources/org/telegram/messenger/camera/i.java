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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.a40;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yt;
import org.telegram.ui.ey;
import org.telegram.ui.p00;
public final class i implements Runnable {
    public final int f18067a;
    public final Object f18068b;
    public final Object f18069c;
    public final Object d;
    public final Object e;

    public i(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18067a = i10;
        this.f18069c = obj;
        this.f18068b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        mz mzVar = (mz) this.f18069c;
        TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.d;
        TLObject tLObject = (TLObject) this.e;
        Runnable runnable = (Runnable) this.f18068b;
        ArrayList arrayList = mzVar.f28614s;
        oz ozVar = mzVar.f28615w;
        if (ozVar.M != mzVar.f28609b) {
            return;
        }
        ozVar.L = 0;
        if (tL_messages_getStickers.emoticon.equals(mzVar.f28608a)) {
            if (!(tLObject instanceof TLRPC.TL_messages_stickers)) {
                runnable.run();
                return;
            }
            TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
            int size = arrayList.size();
            int size2 = tL_messages_stickers.stickers.size();
            for (int i10 = 0; i10 < size2; i10++) {
                TLRPC.Document document = tL_messages_stickers.stickers.get(i10);
                if (mzVar.v.indexOfKey(document.f20285id) < 0) {
                    arrayList.add(document);
                }
            }
            if (size != arrayList.size()) {
                mzVar.f28611f.put(arrayList, ozVar.N);
                if (size == 0) {
                    mzVar.h.add(arrayList);
                }
            }
        }
        runnable.run();
    }

    private final void b() {
        k10 k10Var = (k10) this.f18069c;
        TLObject tLObject = (TLObject) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        int i10 = -1;
        k10Var.f27702z0 = -1;
        n2 n2Var = k10Var.f24922n;
        p00.r0((TLRPC.TL_error) this.f18068b, n2Var, xc.a0(n2Var));
        int i11 = 0;
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.Updates) {
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                ArrayList<TLRPC.Update> arrayList = updates.updates;
                if (arrayList.isEmpty()) {
                    TLRPC.Update update = updates.update;
                    if (update instanceof TL_update.TL_updateDialogFilter) {
                        i10 = ((TL_update.TL_updateDialogFilter) update).f20531id;
                    }
                } else {
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        } else if (arrayList.get(i11) instanceof TL_update.TL_updateDialogFilter) {
                            i10 = ((TL_update.TL_updateDialogFilter) arrayList.get(i11)).f20531id;
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
            }
            if (k10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                n2Var.getMessagesController().loadRemoteFilters(true, new g4(k10Var, callback, i10, 3));
                return;
            }
            if (k10Var.f27678a0 != null) {
                n2Var.getMessagesController().checkChatlistFolderUpdate(k10Var.Y, true);
            }
            k10Var.A0 = true;
            k10Var.dismiss();
            callback.run(Integer.valueOf(i10));
            return;
        }
        k10Var.f27689l0.a(false);
    }

    private final void c() {
        ((ey) this.f18069c).u4(((Integer) this.f18068b).intValue());
        AndroidUtilities.runOnUIThread(new yt(12, (qy) this.d, (n2) this.e), 200L);
    }

    private final void d() {
        a40.O((a40) this.f18069c, (TLRPC.TL_error) this.f18068b, (TLObject) this.d, (TLRPC.TL_channels_getParticipants) this.e);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.camera.i.run():void");
    }

    public i(Runnable runnable, CameraSession cameraSession, CountDownLatch countDownLatch, Runnable runnable2) {
        this.f18067a = 1;
        this.f18068b = runnable;
        this.f18069c = cameraSession;
        this.e = countDownLatch;
        this.d = runnable2;
    }

    public i(CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        this.f18067a = 0;
        this.f18069c = cameraSession;
        this.f18068b = runnable;
        this.e = surfaceTexture;
        this.d = runnable2;
    }

    public i(mz mzVar, TLRPC.TL_messages_getStickers tL_messages_getStickers, TLObject tLObject, Runnable runnable) {
        this.f18067a = 25;
        this.f18069c = mzVar;
        this.d = tL_messages_getStickers;
        this.e = tLObject;
        this.f18068b = runnable;
    }
}

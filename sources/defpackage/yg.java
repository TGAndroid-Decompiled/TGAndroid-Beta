package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
public final class yg implements ee, fu2, ni7, mac, es6, yeb, NativeInstance.PayloadCallback {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;

    public yg(int i, Context context, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.a = (byte) 17;
        this.b = i;
        this.c = context;
        this.d = tL_messages_stickerSet;
    }

    @Override
    public final void accept(java.lang.Object r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yg.accept(java.lang.Object):void");
    }

    @Override
    public final void b(Canvas canvas) {
        tj9 tj9Var = (tj9) this.c;
        AtomicReference atomicReference = tj9Var.E;
        StaticLayout staticLayout = tj9Var.b;
        ArrayList arrayList = tj9Var.x;
        rna.g((View) this.d, false, this.b, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        boa.a(canvas, tj9Var.b);
        gn.drawAnimatedEmojis(canvas, tj9Var.b, tj9Var.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override
    public final Object e() {
        ((in3) ((za0) this.c).d).E((rb0) this.d, this.b + 1, false);
        return null;
    }

    @Override
    public final void f(String str, ArrayList arrayList) {
        d3b d3bVar = (d3b) this.c;
        HashMap hashMap = (HashMap) this.d;
        e3b e3bVar = d3bVar.a;
        int i = e3bVar.Q;
        HashMap hashMap2 = e3bVar.J;
        if (this.b == i) {
            int size = arrayList.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                String str2 = ((ds6) arrayList.get(i2)).a;
                ArrayList arrayList2 = (ArrayList) hashMap.get(str2);
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    d3bVar.a();
                    if (!hashMap2.containsKey(arrayList2)) {
                        hashMap2.put(arrayList2, str2);
                        e3bVar.K.add(arrayList2);
                        z = true;
                    }
                }
            }
            if (z) {
                e3bVar.f();
            }
        }
    }

    @Override
    public final void h(Object obj, TLRPC.Document document, Boolean bool) {
        Context context = (Context) this.c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        int i = this.b;
        String str = "😀";
        String V = k47.V(document, "😀", Integer.valueOf(i));
        if (!TextUtils.isEmpty(V)) {
            str = V;
        }
        he heVar = new he(3, null, context);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = hs6.b0(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = hs6.c0(document, str);
        ConnectionsManager.getInstance(z8c.t0).sendRequest(tL_stickers_addStickerToSet, new ev0(heVar, i, document, obj, tL_stickers_addStickerToSet, (byte) 13));
        try {
            heVar.q(350L);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void r(he heVar, int i) {
        int i2;
        byte b = this.a;
        int i3 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                hk hkVar = (hk) obj2;
                af7 af7Var = (af7) obj;
                String trim = hkVar.getText().toString().trim();
                if (trim.length() <= i3 && !trim.isEmpty()) {
                    af7Var.a(trim);
                    heVar.dismiss();
                    return;
                }
                gm.z3(hkVar);
                return;
            case 1:
                j51 j51Var = (j51) obj2;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) obj;
                String obj3 = j51Var.getText().toString();
                if (obj3.length() > 32) {
                    gm.z3(j51Var);
                    return;
                }
                q51 d = q51.d(i3);
                TL_account.TL_businessChatLink c = d.c(tL_businessChatLink.link);
                if (c != null) {
                    TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                    tL_inputBusinessChatLink.message = c.message;
                    tL_inputBusinessChatLink.entities = c.entities;
                    tL_inputBusinessChatLink.title = obj3;
                    d.b(c, tL_inputBusinessChatLink, null);
                }
                heVar.dismiss();
                return;
            case 2:
                yv1 yv1Var = (yv1) obj2;
                boolean[] zArr = (boolean[]) obj;
                boolean z = zArr[0];
                yv1Var.getMessagesController().G3(yv1Var.e, yv1Var.f, this.b, false, !zArr[1], z);
                u31 B = c41.B(yv1Var, true, null, null, yv1Var.Ba);
                B.j();
                y21 y21Var = B.e;
                y21Var.postDelayed(new j21(y21Var, (byte) 2), 550L);
                return;
            case 3:
                ((yv1) obj2).C9(i3, (k47) obj);
                return;
            case 4:
            case 5:
            case 9:
            case 12:
            case 13:
            default:
                ((StickersActivity) obj2).k0(i3, (ArrayList) obj);
                return;
            case 6:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                g95 g95Var = ((d85) obj2).r1.b;
                g95Var.T2.C(i3, editTextBoldCursor.getText().toString());
                gm.t1(editTextBoldCursor);
                UndoView c1 = g95Var.c1();
                if (i3 == 0) {
                    i2 = 39;
                } else {
                    i2 = 100;
                }
                c1.j(i2, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                    return;
                }
                return;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                HashMap hashMap = (HashMap) obj;
                String str = LaunchActivity.C1;
                ArrayList arrayList = launchActivity.e0;
                if (!arrayList.isEmpty() && gm.H1((d) b10.f(1, arrayList))) {
                    pc6 pc6Var = new pc6(0);
                    pc6Var.M0 = new ji(hashMap, i3, (byte) 10);
                    launchActivity.t0(pc6Var);
                    return;
                }
                return;
            case 8:
                ((pc6) obj2).I0(900, i3, (TLRPC.User) obj);
                return;
            case 10:
                goc.M0(i3, (ylb) obj, (Context) obj2);
                return;
            case 11:
                ((PasscodeActivity) obj2).r0((lp7) obj, i3);
                return;
            case 14:
                ru9 ru9Var = (ru9) obj2;
                TLRPC.Reaction reaction = (TLRPC.Reaction) obj;
                String obj4 = ru9Var.getText().toString();
                if (obj4.length() > 12) {
                    gm.z3(ru9Var);
                    return;
                }
                oc7.r1(i3).q4(k39.d(reaction), obj4);
                heVar.dismiss();
                return;
            case 15:
                ((SessionsActivity) obj2).k0(i3, (boolean[]) obj);
                return;
        }
    }

    @Override
    public final void run(int i, String str) {
        ((VoIPService) this.c).lambda$createGroupInstance$69(this.b, (boolean[]) this.d, i, str);
    }

    public yg(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public yg(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}

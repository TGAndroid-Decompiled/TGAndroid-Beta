package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.widget.HorizontalScrollView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
public final class bf implements fd, ot2, ncc, ti7, lcc, is6, sgb, NativeInstance.PayloadCallback {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;

    public bf(int i, Context context, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.a = (byte) 18;
        this.b = i;
        this.c = context;
        this.d = tL_messages_stickerSet;
    }

    @Override
    public final void a(Canvas canvas) {
        gl9 gl9Var = (gl9) this.c;
        AtomicReference atomicReference = gl9Var.E;
        StaticLayout staticLayout = gl9Var.b;
        ArrayList arrayList = gl9Var.x;
        npa.g((View) this.d, false, this.b, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        xpa.a(canvas, gl9Var.b);
        hm.drawAnimatedEmojis(canvas, gl9Var.b, gl9Var.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override
    public final void accept(java.lang.Object r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bf.accept(java.lang.Object):void");
    }

    @Override
    public final void b(String str, ArrayList arrayList) {
        y4b y4bVar = (y4b) this.c;
        HashMap hashMap = (HashMap) this.d;
        z4b z4bVar = y4bVar.a;
        int i = z4bVar.Q;
        HashMap hashMap2 = z4bVar.J;
        if (this.b == i) {
            int size = arrayList.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                String str2 = ((hs6) arrayList.get(i2)).a;
                ArrayList arrayList2 = (ArrayList) hashMap.get(str2);
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    y4bVar.a();
                    if (!hashMap2.containsKey(arrayList2)) {
                        hashMap2.put(arrayList2, str2);
                        z4bVar.K.add(arrayList2);
                        z = true;
                    }
                }
            }
            if (z) {
                z4bVar.f();
            }
        }
    }

    @Override
    public final Object g() {
        ((pm3) ((ba0) this.c).d).E((ta0) this.d, this.b + 1, false);
        return null;
    }

    @Override
    public final void h(Object obj, TLRPC.Document document, Boolean bool) {
        Context context = (Context) this.c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        int i = this.b;
        String str = "😀";
        String V = r47.V(document, "😀", Integer.valueOf(i));
        if (!TextUtils.isEmpty(V)) {
            str = V;
        }
        id idVar = new id(3, null, context);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = ls6.b0(tL_messages_stickerSet.set);
        tL_stickers_addStickerToSet.sticker = ls6.c0(document, str);
        ConnectionsManager.getInstance(yac.t0).sendRequest(tL_stickers_addStickerToSet, new eu0(idVar, i, document, obj, tL_stickers_addStickerToSet, (byte) 13));
        try {
            idVar.q(350L);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        v94 v94Var;
        String str;
        ha4 ha4Var;
        int i;
        lm7 lm7Var = (lm7) this.c;
        jm7 jm7Var = (jm7) this.d;
        b8c b8cVar = (b8c) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        Object obj3 = b8cVar.H;
        boolean z = obj3 instanceof r47;
        int i2 = this.b;
        int i3 = -1;
        if (z) {
            r47 r47Var = (r47) obj3;
            if (view instanceof v94) {
                v94Var = (v94) view;
            } else {
                v94Var = null;
            }
            if (v94Var != null) {
                float floatValue = f.floatValue();
                float floatValue2 = f2.floatValue();
                HorizontalScrollView horizontalScrollView = v94Var.y;
                if (v94Var.R >= 1.0f && horizontalScrollView.getVisibility() == 0 && floatValue2 >= horizontalScrollView.getTop() && floatValue2 <= horizontalScrollView.getBottom()) {
                    float scrollX = (floatValue + horizontalScrollView.getScrollX()) - v94.g();
                    int i4 = 0;
                    while (true) {
                        int[] iArr = v94Var.d0;
                        if (i4 >= iArr.length) {
                            break;
                        }
                        if (scrollX >= iArr[i4] && scrollX <= i + v94Var.e0[i4]) {
                            i3 = i4;
                            break;
                        }
                        i4++;
                    }
                }
            }
            int i5 = i3;
            if (i5 >= 0) {
                ArrayList arrayList = new ArrayList(v94Var.getMedia());
                if (i5 < arrayList.size() && lm7Var.getParentActivity() != null) {
                    String f3 = ea4.f((r47) arrayList.get(i5));
                    r47 message = v94Var.getMessage();
                    if (f3 != null) {
                        ha4Var = lm7Var.n0(i2, message, "open_media", f3);
                    } else {
                        ha4Var = null;
                    }
                    PhotoViewer.q0().T1(null, lm7Var, null);
                    if (PhotoViewer.q0().n1(arrayList, i5, r47.B0(((r47) arrayList.get(0)).k), 0L, 0L, new bm7(i2, message, lm7Var)) && ha4Var != null) {
                        lm7Var.h0(ha4Var, true, null);
                        return;
                    }
                    return;
                }
                return;
            } else if (v94Var != null && v94Var.R > 0.5f && v94Var.L && v94Var.a0 > v94Var.b0 && v94Var.S < 1.0f) {
                String B0 = lm7.B0(i2, r47Var);
                HashMap hashMap = lm7Var.W;
                km7 km7Var = (km7) hashMap.get(B0);
                if (km7Var == null || km7Var.b < 1.0f) {
                    lm7Var.F0(lm7Var.n0(i2, r47Var, "expand", null));
                }
                if (km7Var == null) {
                    km7Var = new km7(lm7Var, 0.0f, 0.0f);
                    hashMap.put(B0, km7Var);
                }
                km7Var.a(1.0f);
                return;
            } else {
                Bundle bundle = new Bundle();
                long B02 = r47.B0(r47Var.k);
                if (B02 < 0) {
                    str = "chat_id";
                } else {
                    str = "user_id";
                }
                bundle.putLong(str, Math.abs(B02));
                bundle.putInt("message_id", r47Var.e1());
                bundle.putBoolean("from_news", true);
                bundle.putBoolean("for_news", true);
                if (lm7Var.getMessagesController().C(bundle, lm7Var, null, null)) {
                    zu1 zu1Var = new zu1(bundle);
                    zu1Var.tb = r47Var;
                    lm7Var.a0.b();
                    lm7Var.D0(zu1Var, i2, r47Var);
                    lm7Var.presentFragment(zu1Var);
                    return;
                }
                return;
            }
        }
        int i6 = b8cVar.d;
        if (i6 == -1) {
            lm7Var.y0(i2, jm7Var.q);
        } else if (i6 == -2) {
            lm7Var.x0();
        }
    }

    @Override
    public final void run(int i, String str) {
        ((VoIPService) this.c).lambda$createGroupInstance$70(this.b, (boolean[]) this.d, i, str);
    }

    @Override
    public final void w(id idVar, int i) {
        int i2;
        byte b = this.a;
        int i3 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ij ijVar = (ij) obj2;
                hf7 hf7Var = (hf7) obj;
                String trim = ijVar.getText().toString().trim();
                if (trim.length() <= i3 && !trim.isEmpty()) {
                    hf7Var.a(trim);
                    idVar.dismiss();
                    return;
                }
                hl.z3(ijVar);
                return;
            case 1:
                k41 k41Var = (k41) obj2;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) obj;
                String obj3 = k41Var.getText().toString();
                if (obj3.length() > 32) {
                    hl.z3(k41Var);
                    return;
                }
                r41 d = r41.d(i3);
                TL_account.TL_businessChatLink c = d.c(tL_businessChatLink.link);
                if (c != null) {
                    TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                    tL_inputBusinessChatLink.message = c.message;
                    tL_inputBusinessChatLink.entities = c.entities;
                    tL_inputBusinessChatLink.title = obj3;
                    d.b(c, tL_inputBusinessChatLink, null);
                }
                idVar.dismiss();
                return;
            case 2:
                zu1 zu1Var = (zu1) obj2;
                boolean[] zArr = (boolean[]) obj;
                boolean z = zArr[0];
                zu1Var.getMessagesController().L3(zu1Var.e, zu1Var.f, this.b, false, !zArr[1], z);
                v21 B = d31.B(zu1Var, true, null, null, zu1Var.Ba);
                B.j();
                z11 z11Var = B.e;
                z11Var.postDelayed(new j11(z11Var, (byte) 2), 550L);
                return;
            case 3:
                ((zu1) obj2).D9(i3, (r47) obj);
                return;
            case 4:
            case 5:
            case 9:
            case 10:
            case 13:
            case 14:
            default:
                ((StickersActivity) obj2).j0(i3, (ArrayList) obj);
                return;
            case 6:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                j95 j95Var = ((h85) obj2).r1.b;
                j95Var.T2.C(i3, editTextBoldCursor.getText().toString());
                hl.t1(editTextBoldCursor);
                UndoView d1 = j95Var.d1();
                if (i3 == 0) {
                    i2 = 39;
                } else {
                    i2 = 100;
                }
                d1.j(i2, 0L, null);
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
                if (!arrayList.isEmpty() && hl.H1((e) c00.g(1, arrayList))) {
                    uc6 uc6Var = new uc6(0);
                    uc6Var.M0 = new wg(hashMap, i3, (byte) 9);
                    launchActivity.t0(uc6Var);
                    return;
                }
                return;
            case 8:
                ((uc6) obj2).I0(900, i3, (TLRPC.User) obj);
                return;
            case 11:
                uqc.L0(i3, (vnb) obj, (Context) obj2);
                return;
            case 12:
                ((PasscodeActivity) obj2).q0((hq7) obj, i3);
                return;
            case 15:
                iw9 iw9Var = (iw9) obj2;
                TLRPC.Reaction reaction = (TLRPC.Reaction) obj;
                String obj4 = iw9Var.getText().toString();
                if (obj4.length() > 12) {
                    hl.z3(iw9Var);
                    return;
                }
                uc7.s1(i3).w4(w49.d(reaction), obj4);
                idVar.dismiss();
                return;
            case 16:
                ((SessionsActivity) obj2).j0(i3, (boolean[]) obj);
                return;
        }
    }

    public bf(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public bf(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}

package jg;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.a8;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.ui;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.xn;
import org.telegram.ui.an;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
public final class r implements Runnable {
    public final int f16896a;
    public final int f16897b;
    public final int f16898c;
    public final Object d;

    public r(int i7, int i10, Object obj, int i11) {
        this.f16896a = i11;
        this.f16897b = i7;
        this.f16898c = i10;
        this.d = obj;
    }

    @Override
    public final void run() {
        t51 t51Var;
        switch (this.f16896a) {
            case 0:
                int i7 = this.f16897b;
                f0 f0Var = (f0) this.d;
                try {
                    SQLiteCursor queryFinalized = yr.a0(i7).f26698b.queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    a0.h hVar = new a0.h();
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(0);
                        boolean C = m5.C(longValue);
                        int i10 = this.f16898c;
                        if (C) {
                            if (i10 == 0 || i10 == 3) {
                                int i11 = (int) (4294967295L & longValue);
                                if (!arrayList3.contains(Integer.valueOf(i11))) {
                                    arrayList3.add(Integer.valueOf(i11));
                                    ?? obj = new Object();
                                    obj.f16726c = longValue;
                                    obj.f16725b = queryFinalized.intValue(1);
                                    arrayList4.add(obj);
                                    hVar.k(obj, obj.f16726c);
                                }
                            }
                        } else if (m5.E(longValue)) {
                            if (i10 != 2 && !arrayList.contains(Long.valueOf(longValue))) {
                                arrayList.add(Long.valueOf(longValue));
                                ?? obj2 = new Object();
                                obj2.f16726c = longValue;
                                obj2.f16725b = queryFinalized.intValue(1);
                                arrayList4.add(obj2);
                                hVar.k(obj2, obj2.f16726c);
                            }
                        } else {
                            long j3 = -longValue;
                            if (!arrayList2.contains(Long.valueOf(j3))) {
                                arrayList2.add(Long.valueOf(j3));
                                ?? obj22 = new Object();
                                obj22.f16726c = longValue;
                                obj22.f16725b = queryFinalized.intValue(1);
                                arrayList4.add(obj22);
                                hVar.k(obj22, obj22.f16726c);
                            }
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList arrayList5 = new ArrayList();
                    if (!arrayList3.isEmpty()) {
                        ArrayList arrayList6 = new ArrayList();
                        yr.a0(i7).V(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                            g0 g0Var = (g0) hVar.f(m5.F(((TLRPC.EncryptedChat) arrayList6.get(i12)).f26961id));
                            if (g0Var != null) {
                                g0Var.f16724a = (TLObject) arrayList6.get(i12);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList arrayList7 = new ArrayList();
                        yr.a0(i7).Q(TextUtils.join(",", arrayList2), arrayList7);
                        for (int i13 = 0; i13 < arrayList7.size(); i13++) {
                            TLRPC.Chat chat = (TLRPC.Chat) arrayList7.get(i13);
                            long j10 = -chat.f26953id;
                            if (chat.migrated_to != null) {
                                g0 g0Var2 = (g0) hVar.f(j10);
                                hVar.l(j10);
                                if (g0Var2 != null) {
                                    arrayList4.remove(g0Var2);
                                }
                            } else {
                                g0 g0Var3 = (g0) hVar.f(j10);
                                if (g0Var3 != null) {
                                    g0Var3.f16724a = chat;
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        yr.a0(i7).n0(arrayList, arrayList5, false);
                        for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                            TLRPC.User user = (TLRPC.User) arrayList5.get(i14);
                            g0 g0Var4 = (g0) hVar.f(user.f27102id);
                            if (g0Var4 != null) {
                                g0Var4.f16724a = user;
                            }
                        }
                    }
                    Collections.sort(arrayList4, new x(0));
                    org.telegram.messenger.g0.h3(new fi.x1(f0Var, arrayList4, hVar, 17));
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                l2.i0 i0Var = (l2.i0) this.d;
                h2.r rVar = i0Var.f17870m;
                int i15 = this.f16897b;
                int i16 = this.f16898c;
                rVar.e(24, new gh.c(i15, i16, 2));
                i0Var.t1(2, 14, new h2.y(i15, i16));
                return;
            case 2:
                ((l2.c0) this.d).f17771a.q1(this.f16897b, this.f16898c);
                return;
            case 3:
                MediaController mediaController = (MediaController) ((f5.u) this.d).f11191c;
                if (this.f16897b == mediaController.f21272k0 && this.f16898c == 4 && (t51Var = mediaController.f21270j0) != null) {
                    try {
                        t51Var.m0();
                        mediaController.f21270j0 = null;
                        return;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                        return;
                    }
                }
                return;
            case 4:
                ((ui) this.d).Y[this.f16897b] = this.f16898c;
                return;
            case 5:
                PushListenerController.lambda$sendRegistrationToServer$0(this.f16897b, this.f16898c, (String) this.d);
                return;
            case 6:
                VoIPGroupNotification.decline((Context) this.d, this.f16897b, this.f16898c);
                return;
            case 7:
                ((VoIPService) this.d).lambda$initiateActualEncryptedCall$86(this.f16897b, this.f16898c);
                return;
            case 8:
                ((ConnectionsManager) this.d).lambda$discardConnection$0(this.f16897b, this.f16898c);
                return;
            case 9:
                org.telegram.ui.web.u0 u0Var = (org.telegram.ui.web.u0) this.d;
                for (int i17 = 0; i17 < this.f16897b - this.f16898c; i17++) {
                    u0Var.goBack();
                }
                return;
            case 10:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", p10.i(this.f16897b).e());
                bundle.putInt("message_id", this.f16898c);
                ((f2) this.d).presentFragment(new an(bundle));
                return;
            case 11:
                xn xnVar = (xn) this.d;
                int i18 = this.f16897b;
                if (i18 != 0) {
                    SharedPreferences sharedPreferences = qp.s1(this.f16898c).f24757d7;
                    sharedPreferences.edit().putInt("last_selected_mute_until_time", i18).putInt("last_selected_mute_until_time2", sharedPreferences.getInt("last_selected_mute_until_time", 0)).apply();
                }
                xnVar.R(i18);
                return;
            case 12:
                qn qnVar = (qn) this.d;
                int i19 = this.f16897b;
                if (i19 != 0) {
                    SharedPreferences sharedPreferences2 = qp.s1(this.f16898c).f24757d7;
                    sharedPreferences2.edit().putInt("last_selected_mute_until_time", i19).putInt("last_selected_mute_until_time2", sharedPreferences2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                qnVar.a(Integer.valueOf(i19));
                return;
            case 13:
                ca0 ca0Var = (ca0) ((bi.q1) this.d).f4554f3;
                View d = ca0Var.d();
                bi.q1 q1Var = ca0Var.f32496f;
                if (d != null) {
                    int top = d.getTop() + this.f16897b;
                    int top2 = d.getTop() + this.f16898c;
                    int i20 = top2 - top;
                    int paddingTop = q1Var.getPaddingTop();
                    int height = q1Var.getHeight() - q1Var.getPaddingBottom();
                    if (i20 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i21 = top - paddingTop;
                    if (i21 < 0) {
                        q1Var.scrollBy(0, i21);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                ((SurfaceTextureHelper) this.d).lambda$setTextureSize$2(this.f16897b, this.f16898c);
                return;
            case 15:
                SurfaceViewRenderer.a((SurfaceViewRenderer) this.d, this.f16897b, this.f16898c);
                return;
            default:
                ((TextureViewRenderer) this.d).lambda$updateVideoSizes$1(this.f16897b, this.f16898c);
                return;
        }
    }

    public r(Object obj, int i7, int i10, int i11) {
        this.f16896a = i11;
        this.d = obj;
        this.f16897b = i7;
        this.f16898c = i10;
    }

    public r(l2.c0 c0Var, SurfaceTexture surfaceTexture, int i7, int i10) {
        this.f16896a = 2;
        this.d = c0Var;
        this.f16897b = i7;
        this.f16898c = i10;
    }
}

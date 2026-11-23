package jg;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ScrollView;
import bi.o4;
import di.a8;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.no;
import org.telegram.ui.bn;
import org.webrtc.ScreenCapturerAndroid;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
public final class q implements Runnable {
    public final int f17713a;
    public final int f17714b;
    public final int f17715c;
    public final Object d;

    public q(int i7, int i10, Object obj, int i11) {
        this.f17713a = i11;
        this.f17714b = i7;
        this.f17715c = i10;
        this.d = obj;
    }

    @Override
    public final void run() {
        h61 h61Var;
        switch (this.f17713a) {
            case 0:
                int i7 = this.f17714b;
                f0 f0Var = (f0) this.d;
                try {
                    SQLiteCursor queryFinalized = tr.a0(i7).f27151b.queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    a0.h hVar = new a0.h();
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(0);
                        boolean C = n5.C(longValue);
                        int i10 = this.f17715c;
                        if (C) {
                            if (i10 == 0 || i10 == 3) {
                                int i11 = (int) (4294967295L & longValue);
                                if (!arrayList3.contains(Integer.valueOf(i11))) {
                                    arrayList3.add(Integer.valueOf(i11));
                                    ?? obj = new Object();
                                    obj.f17558c = longValue;
                                    obj.f17557b = queryFinalized.intValue(1);
                                    arrayList4.add(obj);
                                    hVar.k(obj, obj.f17558c);
                                }
                            }
                        } else if (n5.E(longValue)) {
                            if (i10 != 2 && !arrayList.contains(Long.valueOf(longValue))) {
                                arrayList.add(Long.valueOf(longValue));
                                ?? obj2 = new Object();
                                obj2.f17558c = longValue;
                                obj2.f17557b = queryFinalized.intValue(1);
                                arrayList4.add(obj2);
                                hVar.k(obj2, obj2.f17558c);
                            }
                        } else {
                            long j3 = -longValue;
                            if (!arrayList2.contains(Long.valueOf(j3))) {
                                arrayList2.add(Long.valueOf(j3));
                                ?? obj22 = new Object();
                                obj22.f17558c = longValue;
                                obj22.f17557b = queryFinalized.intValue(1);
                                arrayList4.add(obj22);
                                hVar.k(obj22, obj22.f17558c);
                            }
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList arrayList5 = new ArrayList();
                    if (!arrayList3.isEmpty()) {
                        ArrayList arrayList6 = new ArrayList();
                        tr.a0(i7).V(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                            g0 g0Var = (g0) hVar.f(n5.F(((TLRPC.EncryptedChat) arrayList6.get(i12)).f28500id));
                            if (g0Var != null) {
                                g0Var.f17556a = (TLObject) arrayList6.get(i12);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList arrayList7 = new ArrayList();
                        tr.a0(i7).Q(TextUtils.join(",", arrayList2), arrayList7);
                        for (int i13 = 0; i13 < arrayList7.size(); i13++) {
                            TLRPC.Chat chat = (TLRPC.Chat) arrayList7.get(i13);
                            long j10 = -chat.f28492id;
                            if (chat.migrated_to != null) {
                                g0 g0Var2 = (g0) hVar.f(j10);
                                hVar.l(j10);
                                if (g0Var2 != null) {
                                    arrayList4.remove(g0Var2);
                                }
                            } else {
                                g0 g0Var3 = (g0) hVar.f(j10);
                                if (g0Var3 != null) {
                                    g0Var3.f17556a = chat;
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        tr.a0(i7).n0(arrayList, arrayList5, false);
                        for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                            TLRPC.User user = (TLRPC.User) arrayList5.get(i14);
                            g0 g0Var4 = (g0) hVar.f(user.f28641id);
                            if (g0Var4 != null) {
                                g0Var4.f17556a = user;
                            }
                        }
                    }
                    Collections.sort(arrayList4, new w(0));
                    org.telegram.messenger.g0.g3(new a8(f0Var, arrayList4, hVar, 23));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                l2.g0 g0Var5 = (l2.g0) this.d;
                h2.r rVar = g0Var5.f19434m;
                int i15 = this.f17714b;
                int i16 = this.f17715c;
                rVar.e(24, new gh.c(i15, i16, 2));
                g0Var5.t1(2, 14, new h2.y(i15, i16));
                return;
            case 2:
                ((l2.a0) this.d).f19342a.q1(this.f17714b, this.f17715c);
                return;
            case 3:
                MediaController mediaController = (MediaController) ((b3.j) this.d).f2874c;
                if (this.f17714b == mediaController.f22818l0 && this.f17715c == 4 && (h61Var = mediaController.f22816k0) != null) {
                    try {
                        h61Var.m0();
                        mediaController.f22816k0 = null;
                        return;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        return;
                    }
                }
                return;
            case 4:
                ((ri) this.d).Z[this.f17714b] = this.f17715c;
                return;
            case 5:
                PushListenerController.lambda$sendRegistrationToServer$0(this.f17714b, this.f17715c, (String) this.d);
                return;
            case 6:
                VoIPGroupNotification.decline((Context) this.d, this.f17714b, this.f17715c);
                return;
            case 7:
                ((VoIPService) this.d).lambda$initiateActualEncryptedCall$86(this.f17714b, this.f17715c);
                return;
            case 8:
                ((ConnectionsManager) this.d).lambda$discardConnection$0(this.f17714b, this.f17715c);
                return;
            case 9:
                org.telegram.ui.web.s0 s0Var = (org.telegram.ui.web.s0) this.d;
                for (int i17 = 0; i17 < this.f17714b - this.f17715c; i17++) {
                    s0Var.goBack();
                }
                return;
            case 10:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", i10.i(this.f17714b).e());
                bundle.putInt("message_id", this.f17715c);
                ((g2) this.d).presentFragment(new bn(bundle));
                return;
            case 11:
                ((ScrollView) this.d).scrollTo(0, Math.max(0, (org.telegram.messenger.g0.L(44.0f) * this.f17714b) - (this.f17715c / 2)));
                return;
            case 12:
                no noVar = (no) this.d;
                int i18 = this.f17714b;
                if (i18 != 0) {
                    SharedPreferences sharedPreferences = mp.u1(this.f17715c).f25753g7;
                    sharedPreferences.edit().putInt("last_selected_mute_until_time", i18).putInt("last_selected_mute_until_time2", sharedPreferences.getInt("last_selected_mute_until_time", 0)).apply();
                }
                noVar.Q(i18);
                return;
            case 13:
                o4 o4Var = (o4) this.d;
                int i19 = this.f17714b;
                if (i19 != 0) {
                    SharedPreferences sharedPreferences2 = mp.u1(this.f17715c).f25753g7;
                    sharedPreferences2.edit().putInt("last_selected_mute_until_time", i19).putInt("last_selected_mute_until_time2", sharedPreferences2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                o4Var.a(Integer.valueOf(i19));
                return;
            case 14:
                na0 na0Var = (na0) ((di.b1) this.d).f8507g3;
                View d = na0Var.d();
                di.b1 b1Var = na0Var.f37744f;
                if (d != null) {
                    int top = d.getTop() + this.f17714b;
                    int top2 = d.getTop() + this.f17715c;
                    int i20 = top2 - top;
                    int paddingTop = b1Var.getPaddingTop();
                    int height = b1Var.getHeight() - b1Var.getPaddingBottom();
                    if (i20 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i21 = top - paddingTop;
                    if (i21 < 0) {
                        b1Var.scrollBy(0, i21);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                ((ScreenCapturerAndroid) this.d).lambda$changeCaptureFormat$1(this.f17714b, this.f17715c);
                return;
            case 16:
                ((SurfaceTextureHelper) this.d).lambda$setTextureSize$2(this.f17714b, this.f17715c);
                return;
            case 17:
                SurfaceViewRenderer.a((SurfaceViewRenderer) this.d, this.f17714b, this.f17715c);
                return;
            default:
                ((TextureViewRenderer) this.d).lambda$updateVideoSizes$1(this.f17714b, this.f17715c);
                return;
        }
    }

    public q(Object obj, int i7, int i10, int i11) {
        this.f17713a = i11;
        this.d = obj;
        this.f17714b = i7;
        this.f17715c = i10;
    }

    public q(l2.a0 a0Var, SurfaceTexture surfaceTexture, int i7, int i10) {
        this.f17713a = 2;
        this.d = a0Var;
        this.f17714b = i7;
        this.f17715c = i10;
    }
}

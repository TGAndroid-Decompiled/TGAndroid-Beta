package k2;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import ei.h9;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.a8;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.li;
import org.telegram.messenger.m5;
import org.telegram.messenger.qr;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.wn;
import org.telegram.ui.Components.x90;
import org.telegram.ui.wm;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
public final class u implements Runnable {
    public final int f16741a;
    public final int f16742b;
    public final int f16743c;
    public final Object d;

    public u(int i3, int i10, Object obj, int i11) {
        this.f16741a = i11;
        this.f16742b = i3;
        this.f16743c = i10;
        this.d = obj;
    }

    @Override
    public final void run() {
        m51 m51Var;
        switch (this.f16741a) {
            case 0:
                i0 i0Var = (i0) this.d;
                g2.s sVar = i0Var.f16561m;
                int i3 = this.f16742b;
                int i10 = this.f16743c;
                sVar.e(24, new hh.c(i3, i10, 2));
                i0Var.t1(2, 14, new g2.z(i3, i10));
                return;
            case 1:
                ((c0) this.d).f16459a.q1(this.f16742b, this.f16743c);
                return;
            case 2:
                int i11 = this.f16742b;
                kg.c0 c0Var = (kg.c0) this.d;
                try {
                    SQLiteCursor queryFinalized = qr.a0(i11).f24936b.queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    a0.h hVar = new a0.h();
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(0);
                        boolean C = m5.C(longValue);
                        int i12 = this.f16743c;
                        if (C) {
                            if (i12 == 0 || i12 == 3) {
                                int i13 = (int) (4294967295L & longValue);
                                if (!arrayList3.contains(Integer.valueOf(i13))) {
                                    arrayList3.add(Integer.valueOf(i13));
                                    ?? obj = new Object();
                                    obj.f16948c = longValue;
                                    obj.f16947b = queryFinalized.intValue(1);
                                    arrayList4.add(obj);
                                    hVar.k(obj, obj.f16948c);
                                }
                            }
                        } else if (m5.E(longValue)) {
                            if (i12 != 2 && !arrayList.contains(Long.valueOf(longValue))) {
                                arrayList.add(Long.valueOf(longValue));
                                ?? obj2 = new Object();
                                obj2.f16948c = longValue;
                                obj2.f16947b = queryFinalized.intValue(1);
                                arrayList4.add(obj2);
                                hVar.k(obj2, obj2.f16948c);
                            }
                        } else {
                            long j10 = -longValue;
                            if (!arrayList2.contains(Long.valueOf(j10))) {
                                arrayList2.add(Long.valueOf(j10));
                                ?? obj22 = new Object();
                                obj22.f16948c = longValue;
                                obj22.f16947b = queryFinalized.intValue(1);
                                arrayList4.add(obj22);
                                hVar.k(obj22, obj22.f16948c);
                            }
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList arrayList5 = new ArrayList();
                    if (!arrayList3.isEmpty()) {
                        ArrayList arrayList6 = new ArrayList();
                        qr.a0(i11).V(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                            kg.d0 d0Var = (kg.d0) hVar.f(m5.F(((TLRPC.EncryptedChat) arrayList6.get(i14)).f27009id));
                            if (d0Var != null) {
                                d0Var.f16946a = (TLObject) arrayList6.get(i14);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList arrayList7 = new ArrayList();
                        qr.a0(i11).Q(TextUtils.join(",", arrayList2), arrayList7);
                        for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                            TLRPC.Chat chat = (TLRPC.Chat) arrayList7.get(i15);
                            long j11 = -chat.f27001id;
                            if (chat.migrated_to != null) {
                                kg.d0 d0Var2 = (kg.d0) hVar.f(j11);
                                hVar.l(j11);
                                if (d0Var2 != null) {
                                    arrayList4.remove(d0Var2);
                                }
                            } else {
                                kg.d0 d0Var3 = (kg.d0) hVar.f(j11);
                                if (d0Var3 != null) {
                                    d0Var3.f16946a = chat;
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        qr.a0(i11).n0(arrayList, arrayList5, false);
                        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                            TLRPC.User user = (TLRPC.User) arrayList5.get(i16);
                            kg.d0 d0Var4 = (kg.d0) hVar.f(user.f27150id);
                            if (d0Var4 != null) {
                                d0Var4.f16946a = user;
                            }
                        }
                    }
                    Collections.sort(arrayList4, new a3.u(22));
                    org.telegram.messenger.g0.h3(new h9((Object) c0Var, arrayList4, (Cloneable) hVar, 22));
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 3:
                MediaController mediaController = (MediaController) ((e5.u) this.d).f9634c;
                if (this.f16742b == mediaController.f21327l0 && this.f16743c == 4 && (m51Var = mediaController.f21326k0) != null) {
                    try {
                        m51Var.m0();
                        mediaController.f21326k0 = null;
                        return;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                        return;
                    }
                }
                return;
            case 4:
                ((li) this.d).Z[this.f16742b] = this.f16743c;
                return;
            case 5:
                PushListenerController.lambda$sendRegistrationToServer$0(this.f16742b, this.f16743c, (String) this.d);
                return;
            case 6:
                VoIPGroupNotification.d((Context) this.d, this.f16742b, this.f16743c);
                return;
            case 7:
                ((VoIPService) this.d).lambda$initiateActualEncryptedCall$86(this.f16742b, this.f16743c);
                return;
            case 8:
                ((ConnectionsManager) this.d).lambda$discardConnection$0(this.f16742b, this.f16743c);
                return;
            case 9:
                org.telegram.ui.web.t0 t0Var = (org.telegram.ui.web.t0) this.d;
                for (int i17 = 0; i17 < this.f16742b - this.f16743c; i17++) {
                    t0Var.goBack();
                }
                return;
            case 10:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", h10.i(this.f16742b).e());
                bundle.putInt("message_id", this.f16743c);
                ((d2) this.d).presentFragment(new wm(bundle));
                return;
            case 11:
                wn wnVar = (wn) this.d;
                int i18 = this.f16742b;
                if (i18 != 0) {
                    SharedPreferences sharedPreferences = hp.s1(this.f16743c).f22989d7;
                    sharedPreferences.edit().putInt("last_selected_mute_until_time", i18).putInt("last_selected_mute_until_time2", sharedPreferences.getInt("last_selected_mute_until_time", 0)).apply();
                }
                wnVar.z(i18);
                return;
            case 12:
                pn pnVar = (pn) this.d;
                int i19 = this.f16742b;
                if (i19 != 0) {
                    SharedPreferences sharedPreferences2 = hp.s1(this.f16743c).f22989d7;
                    sharedPreferences2.edit().putInt("last_selected_mute_until_time", i19).putInt("last_selected_mute_until_time2", sharedPreferences2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                pnVar.a(Integer.valueOf(i19));
                return;
            case 13:
                x90 x90Var = (x90) ((ci.j1) this.d).f5325g3;
                View d = x90Var.d();
                ci.j1 j1Var = x90Var.f40293f;
                if (d != null) {
                    int top = d.getTop() + this.f16742b;
                    int top2 = d.getTop() + this.f16743c;
                    int i20 = top2 - top;
                    int paddingTop = j1Var.getPaddingTop();
                    int height = j1Var.getHeight() - j1Var.getPaddingBottom();
                    if (i20 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i21 = top - paddingTop;
                    if (i21 < 0) {
                        j1Var.scrollBy(0, i21);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.voip.s0 s0Var = ((org.telegram.ui.Components.voip.q0) this.d).f39538a;
                uf.d dVar = s0Var.P;
                if (dVar != null) {
                    dVar.d(this.f16742b, this.f16743c);
                }
                s0Var.a(false);
                return;
            case 15:
                ((SurfaceTextureHelper) this.d).lambda$setTextureSize$2(this.f16742b, this.f16743c);
                return;
            case 16:
                SurfaceViewRenderer.a((SurfaceViewRenderer) this.d, this.f16742b, this.f16743c);
                return;
            default:
                ((TextureViewRenderer) this.d).lambda$updateVideoSizes$1(this.f16742b, this.f16743c);
                return;
        }
    }

    public u(Object obj, int i3, int i10, int i11) {
        this.f16741a = i11;
        this.d = obj;
        this.f16742b = i3;
        this.f16743c = i10;
    }

    public u(c0 c0Var, SurfaceTexture surfaceTexture, int i3, int i10) {
        this.f16741a = 1;
        this.d = c0Var;
        this.f16742b = i3;
        this.f16743c = i10;
    }
}

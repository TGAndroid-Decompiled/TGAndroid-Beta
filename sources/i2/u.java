package i2;

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
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.is;
import org.telegram.messenger.o5;
import org.telegram.messenger.vi;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.yn;
import org.telegram.ui.un;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
import rh.l5;
public final class u implements Runnable {
    public final int f8091a;
    public final int f8092b;
    public final int f8093c;
    public final Object d;

    public u(int i10, int i11, Object obj, int i12) {
        this.f8091a = i12;
        this.f8092b = i10;
        this.f8093c = i11;
        this.d = obj;
    }

    @Override
    public final void run() {
        v61 v61Var;
        switch (this.f8091a) {
            case 0:
                i0 i0Var = (i0) this.d;
                e2.r rVar = i0Var.f7917m;
                int i10 = this.f8092b;
                int i11 = this.f8093c;
                rVar.e(24, new v(i10, i11, 1));
                i0Var.t1(2, 14, new e2.y(i10, i11));
                return;
            case 1:
                ((c0) this.d).f7822a.q1(this.f8092b, this.f8093c);
                return;
            case 2:
                MediaController mediaController = (MediaController) ((c5.x) this.d).f3828c;
                if (this.f8092b == mediaController.f14462k0 && this.f8093c == 4 && (v61Var = mediaController.f14460j0) != null) {
                    try {
                        v61Var.m0();
                        mediaController.f14460j0 = null;
                        return;
                    } catch (Exception e) {
                        f8.g(e, true);
                        return;
                    }
                }
                return;
            case 3:
                ((vi) this.d).Y[this.f8092b] = this.f8093c;
                return;
            case 4:
                PushListenerController.lambda$sendRegistrationToServer$0(this.f8092b, this.f8093c, (String) this.d);
                return;
            case 5:
                VoIPGroupNotification.d((Context) this.d, this.f8092b, this.f8093c);
                return;
            case 6:
                ((VoIPService) this.d).lambda$initiateActualEncryptedCall$86(this.f8092b, this.f8093c);
                return;
            case 7:
                ((ConnectionsManager) this.d).lambda$discardConnection$0(this.f8092b, this.f8093c);
                return;
            case 8:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.d;
                for (int i12 = 0; i12 < this.f8092b - this.f8093c; i12++) {
                    v0Var.goBack();
                }
                return;
            case 9:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", e20.i(this.f8092b).e());
                bundle.putInt("message_id", this.f8093c);
                ((k2) this.d).presentFragment(new un(bundle));
                return;
            case 10:
                fo foVar = (fo) this.d;
                int i13 = this.f8092b;
                if (i13 != 0) {
                    SharedPreferences sharedPreferences = wp.r1(this.f8093c).e7;
                    sharedPreferences.edit().putInt("last_selected_mute_until_time", i13).putInt("last_selected_mute_until_time2", sharedPreferences.getInt("last_selected_mute_until_time", 0)).apply();
                }
                foVar.y(i13);
                return;
            case 11:
                yn ynVar = (yn) this.d;
                int i14 = this.f8092b;
                if (i14 != 0) {
                    SharedPreferences sharedPreferences2 = wp.r1(this.f8093c).e7;
                    sharedPreferences2.edit().putInt("last_selected_mute_until_time", i14).putInt("last_selected_mute_until_time2", sharedPreferences2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                ynVar.a(Integer.valueOf(i14));
                return;
            case 12:
                ua0 ua0Var = (ua0) ((ag.b1) this.d).f469f3;
                View d = ua0Var.d();
                ag.b1 b1Var = ua0Var.f30916f;
                if (d != null) {
                    int top = d.getTop() + this.f8092b;
                    int top2 = d.getTop() + this.f8093c;
                    int i15 = top2 - top;
                    int paddingTop = b1Var.getPaddingTop();
                    int height = b1Var.getHeight() - b1Var.getPaddingBottom();
                    if (i15 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i16 = top - paddingTop;
                    if (i16 < 0) {
                        b1Var.scrollBy(0, i16);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Components.voip.t0 t0Var = ((org.telegram.ui.Components.voip.s0) this.d).f31714a;
                jf.f fVar = t0Var.O;
                if (fVar != null) {
                    fVar.d(this.f8092b, this.f8093c);
                }
                t0Var.a(false);
                return;
            case 14:
                ((SurfaceTextureHelper) this.d).lambda$setTextureSize$2(this.f8092b, this.f8093c);
                return;
            case 15:
                SurfaceViewRenderer.a((SurfaceViewRenderer) this.d, this.f8092b, this.f8093c);
                return;
            case 16:
                ((TextureViewRenderer) this.d).lambda$updateVideoSizes$1(this.f8092b, this.f8093c);
                return;
            default:
                int i17 = this.f8092b;
                zf.x xVar = (zf.x) this.d;
                try {
                    SQLiteCursor queryFinalized = is.a0(i17).f16333b.queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    a0.h hVar = new a0.h();
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(0);
                        boolean C = o5.C(longValue);
                        int i18 = this.f8093c;
                        if (C) {
                            if (i18 == 0 || i18 == 3) {
                                int i19 = (int) (4294967295L & longValue);
                                if (!arrayList3.contains(Integer.valueOf(i19))) {
                                    arrayList3.add(Integer.valueOf(i19));
                                    ?? obj = new Object();
                                    obj.f55698c = longValue;
                                    obj.f55697b = queryFinalized.intValue(1);
                                    arrayList4.add(obj);
                                    hVar.k(obj, obj.f55698c);
                                }
                            }
                        } else if (o5.E(longValue)) {
                            if (i18 != 2 && !arrayList.contains(Long.valueOf(longValue))) {
                                arrayList.add(Long.valueOf(longValue));
                                ?? obj2 = new Object();
                                obj2.f55698c = longValue;
                                obj2.f55697b = queryFinalized.intValue(1);
                                arrayList4.add(obj2);
                                hVar.k(obj2, obj2.f55698c);
                            }
                        } else {
                            long j10 = -longValue;
                            if (!arrayList2.contains(Long.valueOf(j10))) {
                                arrayList2.add(Long.valueOf(j10));
                                ?? obj22 = new Object();
                                obj22.f55698c = longValue;
                                obj22.f55697b = queryFinalized.intValue(1);
                                arrayList4.add(obj22);
                                hVar.k(obj22, obj22.f55698c);
                            }
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList arrayList5 = new ArrayList();
                    if (!arrayList3.isEmpty()) {
                        ArrayList arrayList6 = new ArrayList();
                        is.a0(i17).V(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        for (int i20 = 0; i20 < arrayList6.size(); i20++) {
                            zf.y yVar = (zf.y) hVar.f(o5.F(((TLRPC.EncryptedChat) arrayList6.get(i20)).f19802id));
                            if (yVar != null) {
                                yVar.f55696a = (TLObject) arrayList6.get(i20);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList arrayList7 = new ArrayList();
                        is.a0(i17).Q(TextUtils.join(",", arrayList2), arrayList7);
                        for (int i21 = 0; i21 < arrayList7.size(); i21++) {
                            TLRPC.Chat chat = (TLRPC.Chat) arrayList7.get(i21);
                            long j11 = -chat.f19794id;
                            if (chat.migrated_to != null) {
                                zf.y yVar2 = (zf.y) hVar.f(j11);
                                hVar.l(j11);
                                if (yVar2 != null) {
                                    arrayList4.remove(yVar2);
                                }
                            } else {
                                zf.y yVar3 = (zf.y) hVar.f(j11);
                                if (yVar3 != null) {
                                    yVar3.f55696a = chat;
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        is.a0(i17).n0(arrayList, arrayList5, false);
                        for (int i22 = 0; i22 < arrayList5.size(); i22++) {
                            TLRPC.User user = (TLRPC.User) arrayList5.get(i22);
                            zf.y yVar4 = (zf.y) hVar.f(user.f19943id);
                            if (yVar4 != null) {
                                yVar4.f55696a = user;
                            }
                        }
                    }
                    Collections.sort(arrayList4, new x2.e(9));
                    org.telegram.messenger.i0.g3(new l5(xVar, arrayList4, hVar, 28));
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
        }
    }

    public u(c0 c0Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f8091a = 1;
        this.d = c0Var;
        this.f8092b = i10;
        this.f8093c = i11;
    }

    public u(Object obj, int i10, int i11, int i12) {
        this.f8091a = i12;
        this.d = obj;
        this.f8092b = i10;
        this.f8093c = i11;
    }
}

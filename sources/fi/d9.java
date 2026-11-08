package fi;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.hf;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.sy;
public final class d9 implements CameraView.CameraViewDelegate, r0.m, org.telegram.ui.ActionBar.r1, q71, g51, y7, c7 {
    public final int f11796a;
    public final va f11797b;

    public d9(va vaVar, int i7) {
        this.f11796a = i7;
        this.f11797b = vaVar;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i7 = I0.f15120a;
        va vaVar = this.f11797b;
        vaVar.Y = i7;
        vaVar.Z = I0.f15121b;
        vaVar.f12935a0 = I0.f15122c;
        vaVar.f12939b0 = I0.d;
        vaVar.f12975n.requestLayout();
        return r0.k1.f54200b;
    }

    @Override
    public void a(sy syVar) {
        hf hfVar;
        va vaVar = this.f11797b;
        if (syVar != null) {
            e7 e7Var = vaVar.K1;
            if (e7Var != null && (hfVar = e7Var.f11878a1) != null) {
                syVar.d(new org.telegram.ui.Components.n(hfVar));
                return;
            }
            return;
        }
        vaVar.getClass();
    }

    @Override
    public void b(float f10) {
        va vaVar = this.f11797b;
        y9 y9Var = vaVar.B0;
        if (y9Var != null) {
            vaVar.T1 = f10;
            y9Var.setZoom(f10);
        }
        vaVar.i0(true);
    }

    @Override
    public Bitmap c(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.f11797b.K1.L.getAbsolutePath(), options);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f11796a) {
            case 2:
                va vaVar = this.f11797b;
                vaVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25566b.getPackageName()));
                    vaVar.f12938b.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 3:
                va vaVar2 = this.f11797b;
                vaVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25566b.getPackageName()));
                    vaVar2.f12938b.startActivity(intent2);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 4:
            case 6:
            default:
                va vaVar3 = this.f11797b;
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25566b.getPackageName()));
                    vaVar3.f12938b.startActivity(intent3);
                    return;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
            case 5:
                va vaVar4 = this.f11797b;
                vaVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25566b.getPackageName()));
                    vaVar4.f12938b.startActivity(intent4);
                    return;
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                    return;
                }
            case 7:
                va vaVar5 = this.f11797b;
                int i10 = vaVar5.f12942c;
                e7 e7Var = vaVar5.K1;
                if (e7Var != null) {
                    e7Var.D0 = qp.s1(i10).X4();
                    vaVar5.V1 = !vaVar5.K1.f11882c;
                    vaVar5.h(null);
                    vaVar5.k();
                    vaVar5.l();
                    vaVar5.x();
                    e7 e7Var2 = vaVar5.K1;
                    e7Var2.i(true);
                    e7Var2.C0 = vaVar5.f12944c1.getText();
                    vaVar5.K1 = null;
                    vaVar5.V(e7Var2, true);
                    z0 z0Var = qp.s1(i10).P1().f9982w;
                    if (e7Var2.f11882c) {
                        z0Var.d(e7Var2);
                    } else {
                        ArrayList arrayList = z0Var.f13230b;
                        if (!e7Var2.f11918u) {
                            z0Var.e(e7Var2);
                            e7Var2.f11879b = Utilities.f21334b.nextLong();
                            y0 y0Var = new y0(e7Var2);
                            arrayList.remove(e7Var2);
                            arrayList.add(0, e7Var2);
                            z0Var.a(y0Var);
                        }
                    }
                    vaVar5.J(0, true);
                    return;
                }
                return;
            case 8:
                va vaVar6 = this.f11797b;
                e7 e7Var3 = vaVar6.K1;
                if (e7Var3 != null && !e7Var3.f11892g && ((!e7Var3.f11904n || e7Var3.f11918u) && e7Var3.f11882c)) {
                    qp.s1(vaVar6.f12942c).P1().f9982w.b(vaVar6.K1);
                    vaVar6.K1 = null;
                }
                e7 e7Var4 = vaVar6.K1;
                if (e7Var4 != null && (e7Var4.f11906o || e7Var4.f11892g || (e7Var4.f11904n && !e7Var4.f11918u))) {
                    vaVar6.p(true);
                    return;
                } else {
                    vaVar6.J(0, true);
                    return;
                }
        }
    }

    @Override
    public void k(final q8 q8Var, final boolean z9, final boolean z10, boolean z11, final boolean z12, final TLRPC.InputPeer inputPeer, final int i7, f2.h hVar, final di.s7 s7Var) {
        switch (this.f11796a) {
            case 9:
                ArrayList arrayList = q8Var.f12679b;
                va vaVar = this.f11797b;
                if (vaVar.K1 != null) {
                    vaVar.X0.x(5, true);
                    vaVar.K1.E0 = q8Var;
                    int i10 = vaVar.f12942c;
                    int i11 = t8.f12863a;
                    SerializedData serializedData = new SerializedData(true);
                    t8.c(serializedData, q8Var);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    t8.c(serializedData2, q8Var);
                    qp.s1(i10).f24774e7.edit().putString("story_privacy2", Utilities.f(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    e7 e7Var = vaVar.K1;
                    e7Var.G0 = z11;
                    e7Var.H0 = z10;
                    e7Var.F0.clear();
                    vaVar.K1.F0.addAll(arrayList);
                    e7 e7Var2 = vaVar.K1;
                    e7Var2.f11901l = true;
                    e7Var2.f11920v0 = inputPeer;
                    ArrayList arrayList2 = vaVar.H1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList2.get(i12);
                            i12++;
                            e7 e7Var3 = (e7) obj;
                            e7Var3.E0 = q8Var;
                            ArrayList arrayList3 = e7Var3.F0;
                            e7Var3.G0 = z11;
                            e7Var3.H0 = z10;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            e7Var3.f11901l = true;
                            e7Var3.f11920v0 = inputPeer;
                        }
                    }
                    vaVar.h(new a9(vaVar, hVar, 0));
                    return;
                }
                return;
            default:
                String[] strArr = z12 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final va vaVar2 = this.f11797b;
                c8.ia.b(strArr, new c20() {
                    @Override
                    public final void a(Object obj2) {
                        boolean z13;
                        final boolean z14;
                        TLRPC.InputPeer inputPeer2;
                        long e10;
                        final va vaVar3 = va.this;
                        int i13 = vaVar3.f12942c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final di.s7 s7Var2 = s7Var;
                        if (!booleanValue) {
                            s7Var2.run();
                            return;
                        }
                        y9 y9Var = vaVar3.B0;
                        if (y9Var != null && !y9Var.isFrontface()) {
                            z14 = false;
                            z13 = true;
                        } else {
                            z13 = true;
                            z14 = true;
                        }
                        final TL_stories.TL_startLive tL_startLive = new TL_stories.TL_startLive();
                        tL_startLive.noforwards = z13 ^ z10;
                        TLRPC.InputPeer inputPeer3 = inputPeer;
                        if (inputPeer3 == null) {
                            inputPeer2 = new TLRPC.TL_inputPeerSelf();
                        } else {
                            inputPeer2 = inputPeer3;
                        }
                        tL_startLive.peer = inputPeer2;
                        if (inputPeer3 != null && !(inputPeer3 instanceof TLRPC.TL_inputPeerSelf)) {
                            e10 = org.telegram.messenger.m5.n(inputPeer3);
                        } else {
                            e10 = p10.i(i13).e();
                        }
                        final long j3 = e10;
                        tL_startLive.privacy_rules.addAll(q8Var.f12679b);
                        tL_startLive.random_id = Utilities.f21334b.nextLong();
                        final boolean z15 = z12;
                        tL_startLive.rtmp_stream = z15;
                        tL_startLive.messages_enabled = Boolean.valueOf(z9);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i7);
                        ConnectionsManager.getInstance(i13).sendRequest(tL_startLive, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                org.telegram.messenger.g0.h3(new bi.v8(va.this, tLObject, tL_startLive, z15, j3, z14, tL_error, s7Var2));
                            }
                        });
                    }
                });
                return;
        }
    }

    @Override
    public void onCameraInit() {
        va vaVar = this.f11797b;
        String B = vaVar.B();
        String str = null;
        if (TextUtils.equals(B, vaVar.E())) {
            B = null;
        }
        if (vaVar.f12953f0 == 0) {
            str = B;
        }
        vaVar.d0(str);
        r71 r71Var = vaVar.V0;
        if (r71Var != null) {
            vaVar.T1 = 0.0f;
            r71Var.b(false, 0.0f);
        }
        vaVar.l0(true);
    }
}

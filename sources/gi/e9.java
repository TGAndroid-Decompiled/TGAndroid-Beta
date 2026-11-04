package gi;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import b8.nf;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.messenger.ze;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.py;
public final class e9 implements CameraView.CameraViewDelegate, r0.m, org.telegram.ui.ActionBar.p1, i71, a51, x7, d7 {
    public final int f12669a;
    public final va f12670b;

    public e9(va vaVar, int i3) {
        this.f12669a = i3;
        this.f12670b = vaVar;
    }

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i3 = I0.f14495a;
        va vaVar = this.f12670b;
        vaVar.Z = i3;
        vaVar.f13699a0 = I0.f14496b;
        vaVar.f13703b0 = I0.f14497c;
        vaVar.f13707c0 = I0.d;
        vaVar.f13738n.requestLayout();
        return r0.k1.f54025b;
    }

    @Override
    public void a(py pyVar) {
        ze zeVar;
        va vaVar = this.f12670b;
        if (pyVar != null) {
            f7 f7Var = vaVar.L1;
            if (f7Var != null && (zeVar = f7Var.f12704a1) != null) {
                pyVar.e(new nh(zeVar, 1));
                return;
            }
            return;
        }
        vaVar.getClass();
    }

    @Override
    public void b(float f10) {
        va vaVar = this.f12670b;
        y9 y9Var = vaVar.C0;
        if (y9Var != null) {
            vaVar.U1 = f10;
            y9Var.setZoom(f10);
        }
        vaVar.i0(true);
    }

    @Override
    public void c(final r8 r8Var, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i3, g2.c cVar, final f6 f6Var) {
        switch (this.f12669a) {
            case 9:
                ArrayList arrayList = r8Var.f13527b;
                va vaVar = this.f12670b;
                if (vaVar.L1 != null) {
                    vaVar.Y0.x(5, true);
                    vaVar.L1.E0 = r8Var;
                    int i10 = vaVar.f13706c;
                    int i11 = u8.f13663a;
                    SerializedData serializedData = new SerializedData(true);
                    u8.c(serializedData, r8Var);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    u8.c(serializedData2, r8Var);
                    hp.s1(i10).f22999e7.edit().putString("story_privacy2", Utilities.f(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    f7 f7Var = vaVar.L1;
                    f7Var.G0 = z12;
                    f7Var.H0 = z11;
                    f7Var.F0.clear();
                    vaVar.L1.F0.addAll(arrayList);
                    f7 f7Var2 = vaVar.L1;
                    f7Var2.f12727l = true;
                    f7Var2.f12746v0 = inputPeer;
                    ArrayList arrayList2 = vaVar.I1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList2.get(i12);
                            i12++;
                            f7 f7Var3 = (f7) obj;
                            f7Var3.E0 = r8Var;
                            ArrayList arrayList3 = f7Var3.F0;
                            f7Var3.G0 = z12;
                            f7Var3.H0 = z11;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            f7Var3.f12727l = true;
                            f7Var3.f12746v0 = inputPeer;
                        }
                    }
                    vaVar.h(new b9(vaVar, cVar, 0));
                    return;
                }
                return;
            default:
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final va vaVar2 = this.f12670b;
                nf.b(strArr, new u10() {
                    @Override
                    public final void a(Object obj2) {
                        boolean z14;
                        final boolean z15;
                        TLRPC.InputPeer inputPeer2;
                        long e10;
                        final va vaVar3 = va.this;
                        int i13 = vaVar3.f13706c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final f6 f6Var2 = f6Var;
                        if (!booleanValue) {
                            f6Var2.run();
                            return;
                        }
                        y9 y9Var = vaVar3.C0;
                        if (y9Var != null && !y9Var.isFrontface()) {
                            z15 = false;
                            z14 = true;
                        } else {
                            z14 = true;
                            z15 = true;
                        }
                        final TL_stories.TL_startLive tL_startLive = new TL_stories.TL_startLive();
                        tL_startLive.noforwards = z14 ^ z11;
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
                            e10 = h10.i(i13).e();
                        }
                        final long j10 = e10;
                        tL_startLive.privacy_rules.addAll(r8Var.f13527b);
                        tL_startLive.random_id = Utilities.f21385b.nextLong();
                        final boolean z16 = z13;
                        tL_startLive.rtmp_stream = z16;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i3);
                        ConnectionsManager.getInstance(i13).sendRequest(tL_startLive, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                org.telegram.messenger.g0.h3(new ci.w7(va.this, tLObject, tL_startLive, z16, j10, z15, tL_error, f6Var2));
                            }
                        });
                    }
                });
                return;
        }
    }

    @Override
    public Bitmap f(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.f12670b.L1.L.getAbsolutePath(), options);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f12669a) {
            case 2:
                va vaVar = this.f12670b;
                vaVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25457b.getPackageName()));
                    vaVar.f13702b.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 3:
                va vaVar2 = this.f12670b;
                vaVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25457b.getPackageName()));
                    vaVar2.f13702b.startActivity(intent2);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 4:
            case 6:
            default:
                va vaVar3 = this.f12670b;
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25457b.getPackageName()));
                    vaVar3.f13702b.startActivity(intent3);
                    return;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
            case 5:
                va vaVar4 = this.f12670b;
                vaVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25457b.getPackageName()));
                    vaVar4.f13702b.startActivity(intent4);
                    return;
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                    return;
                }
            case 7:
                va vaVar5 = this.f12670b;
                int i10 = vaVar5.f13706c;
                f7 f7Var = vaVar5.L1;
                if (f7Var != null) {
                    f7Var.D0 = hp.s1(i10).X4();
                    vaVar5.W1 = !vaVar5.L1.f12708c;
                    vaVar5.h(null);
                    vaVar5.k();
                    vaVar5.l();
                    vaVar5.x();
                    f7 f7Var2 = vaVar5.L1;
                    f7Var2.i(true);
                    f7Var2.C0 = vaVar5.f13710d1.getText();
                    vaVar5.L1 = null;
                    vaVar5.V(f7Var2, true);
                    z0 z0Var = hp.s1(i10).P1().f11293w;
                    if (f7Var2.f12708c) {
                        z0Var.d(f7Var2);
                    } else {
                        ArrayList arrayList = z0Var.f13997b;
                        if (!f7Var2.f12744u) {
                            z0Var.e(f7Var2);
                            f7Var2.f12705b = Utilities.f21385b.nextLong();
                            y0 y0Var = new y0(f7Var2);
                            arrayList.remove(f7Var2);
                            arrayList.add(0, f7Var2);
                            z0Var.a(y0Var);
                        }
                    }
                    vaVar5.J(0, true);
                    return;
                }
                return;
            case 8:
                va vaVar6 = this.f12670b;
                f7 f7Var3 = vaVar6.L1;
                if (f7Var3 != null && !f7Var3.f12718g && ((!f7Var3.f12730n || f7Var3.f12744u) && f7Var3.f12708c)) {
                    hp.s1(vaVar6.f13706c).P1().f11293w.b(vaVar6.L1);
                    vaVar6.L1 = null;
                }
                f7 f7Var4 = vaVar6.L1;
                if (f7Var4 != null && (f7Var4.f12732o || f7Var4.f12718g || (f7Var4.f12730n && !f7Var4.f12744u))) {
                    vaVar6.p(true);
                    return;
                } else {
                    vaVar6.J(0, true);
                    return;
                }
        }
    }

    @Override
    public void onCameraInit() {
        va vaVar = this.f12670b;
        String B = vaVar.B();
        String str = null;
        if (TextUtils.equals(B, vaVar.E())) {
            B = null;
        }
        if (vaVar.f13720g0 == 0) {
            str = B;
        }
        vaVar.d0(str);
        j71 j71Var = vaVar.W0;
        if (j71Var != null) {
            vaVar.U1 = 0.0f;
            j71Var.b(false, 0.0f);
        }
        vaVar.l0(true);
    }
}

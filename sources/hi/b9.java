package hi;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.gf;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.wy;
public final class b9 implements CameraView.CameraViewDelegate, r0.m, org.telegram.ui.ActionBar.q1, r71, j51, w7, b7 {
    public final int f13939a;
    public final sa f13940b;

    public b9(sa saVar, int i7) {
        this.f13939a = i7;
        this.f13940b = saVar;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i7 = I0.f15574a;
        sa saVar = this.f13940b;
        saVar.Z = i7;
        saVar.f15036a0 = I0.f15575b;
        saVar.f15040b0 = I0.f15576c;
        saVar.f15044c0 = I0.d;
        saVar.f15076n.requestLayout();
        return r0.k1.f55681b;
    }

    @Override
    public void a(final o8 o8Var, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i7, h4 h4Var, final e1 e1Var) {
        switch (this.f13939a) {
            case 9:
                ArrayList arrayList = o8Var.f14824b;
                sa saVar = this.f13940b;
                if (saVar.L1 != null) {
                    saVar.Y0.x(5, true);
                    saVar.L1.E0 = o8Var;
                    int i10 = saVar.f15043c;
                    int i11 = r8.f14999a;
                    SerializedData serializedData = new SerializedData(true);
                    r8.c(serializedData, o8Var);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    r8.c(serializedData2, o8Var);
                    np.s1(i10).f25283f7.edit().putString("story_privacy2", Utilities.f(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    d7 d7Var = saVar.L1;
                    d7Var.G0 = z12;
                    d7Var.H0 = z11;
                    d7Var.F0.clear();
                    saVar.L1.F0.addAll(arrayList);
                    d7 d7Var2 = saVar.L1;
                    d7Var2.f14148l = true;
                    d7Var2.f14167v0 = inputPeer;
                    ArrayList arrayList2 = saVar.I1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList2.get(i12);
                            i12++;
                            d7 d7Var3 = (d7) obj;
                            d7Var3.E0 = o8Var;
                            ArrayList arrayList3 = d7Var3.F0;
                            d7Var3.G0 = z12;
                            d7Var3.H0 = z11;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            d7Var3.f14148l = true;
                            d7Var3.f14167v0 = inputPeer;
                        }
                    }
                    saVar.h(new y8(saVar, h4Var, 0));
                    return;
                }
                return;
            default:
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final sa saVar2 = this.f13940b;
                c8.ka.b(strArr, new z10() {
                    @Override
                    public final void a(Object obj2) {
                        boolean z14;
                        final boolean z15;
                        TLRPC.InputPeer inputPeer2;
                        long e10;
                        final sa saVar3 = sa.this;
                        int i13 = saVar3.f15043c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final e1 e1Var2 = e1Var;
                        if (!booleanValue) {
                            e1Var2.run();
                            return;
                        }
                        v9 v9Var = saVar3.C0;
                        if (v9Var != null && !v9Var.isFrontface()) {
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
                            e10 = m10.i(i13).e();
                        }
                        final long j3 = e10;
                        tL_startLive.privacy_rules.addAll(o8Var.f14824b);
                        tL_startLive.random_id = Utilities.f22414b.nextLong();
                        final boolean z16 = z13;
                        tL_startLive.rtmp_stream = z16;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i7);
                        ConnectionsManager.getInstance(i13).sendRequest(tL_startLive, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                org.telegram.messenger.g0.h3(new di.o7(sa.this, tLObject, tL_startLive, z16, j3, z15, tL_error, e1Var2));
                            }
                        });
                    }
                });
                return;
        }
    }

    @Override
    public void b(wy wyVar) {
        gf gfVar;
        sa saVar = this.f13940b;
        if (wyVar != null) {
            d7 d7Var = saVar.L1;
            if (d7Var != null && (gfVar = d7Var.f14125a1) != null) {
                wyVar.d(new cf(gfVar));
                return;
            }
            return;
        }
        saVar.getClass();
    }

    @Override
    public void c(float f10) {
        sa saVar = this.f13940b;
        v9 v9Var = saVar.C0;
        if (v9Var != null) {
            saVar.U1 = f10;
            v9Var.setZoom(f10);
        }
        saVar.i0(true);
    }

    @Override
    public Bitmap d(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.f13940b.L1.L.getAbsolutePath(), options);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f13939a) {
            case 2:
                sa saVar = this.f13940b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26609b.getPackageName()));
                    saVar.f15039b.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 3:
                sa saVar2 = this.f13940b;
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26609b.getPackageName()));
                    saVar2.f15039b.startActivity(intent2);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 4:
            case 6:
            default:
                sa saVar3 = this.f13940b;
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26609b.getPackageName()));
                    saVar3.f15039b.startActivity(intent3);
                    return;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
            case 5:
                sa saVar4 = this.f13940b;
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26609b.getPackageName()));
                    saVar4.f15039b.startActivity(intent4);
                    return;
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                    return;
                }
            case 7:
                sa saVar5 = this.f13940b;
                int i10 = saVar5.f15043c;
                d7 d7Var = saVar5.L1;
                if (d7Var != null) {
                    d7Var.D0 = np.s1(i10).Y4();
                    saVar5.W1 = !saVar5.L1.f14129c;
                    saVar5.h(null);
                    saVar5.k();
                    saVar5.l();
                    saVar5.x();
                    d7 d7Var2 = saVar5.L1;
                    d7Var2.i(true);
                    d7Var2.C0 = saVar5.f15048d1.getText();
                    saVar5.L1 = null;
                    saVar5.V(d7Var2, true);
                    a1 a1Var = np.s1(i10).P1().f12338w;
                    if (d7Var2.f14129c) {
                        a1Var.d(d7Var2);
                    } else {
                        ArrayList arrayList = a1Var.f13862b;
                        if (!d7Var2.f14165u) {
                            a1Var.e(d7Var2);
                            d7Var2.f14126b = Utilities.f22414b.nextLong();
                            z0 z0Var = new z0(d7Var2);
                            arrayList.remove(d7Var2);
                            arrayList.add(0, d7Var2);
                            a1Var.a(z0Var);
                        }
                    }
                    saVar5.J(0, true);
                    return;
                }
                return;
            case 8:
                sa saVar6 = this.f13940b;
                d7 d7Var3 = saVar6.L1;
                if (d7Var3 != null && !d7Var3.f14139g && ((!d7Var3.f14151n || d7Var3.f14165u) && d7Var3.f14129c)) {
                    np.s1(saVar6.f15043c).P1().f12338w.b(saVar6.L1);
                    saVar6.L1 = null;
                }
                d7 d7Var4 = saVar6.L1;
                if (d7Var4 != null && (d7Var4.f14153o || d7Var4.f14139g || (d7Var4.f14151n && !d7Var4.f14165u))) {
                    saVar6.p(true);
                    return;
                } else {
                    saVar6.J(0, true);
                    return;
                }
        }
    }

    @Override
    public void onCameraInit() {
        sa saVar = this.f13940b;
        String B = saVar.B();
        String str = null;
        if (TextUtils.equals(B, saVar.E())) {
            B = null;
        }
        if (saVar.f15057g0 == 0) {
            str = B;
        }
        saVar.d0(str);
        s71 s71Var = saVar.W0;
        if (s71Var != null) {
            saVar.U1 = 0.0f;
            s71Var.b(false, 0.0f);
        }
        saVar.l0(true);
    }
}

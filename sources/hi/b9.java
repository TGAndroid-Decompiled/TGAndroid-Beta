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
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.x51;
public final class b9 implements CameraView.CameraViewDelegate, r0.m, org.telegram.ui.ActionBar.q1, e81, x51, w7, b7 {
    public final int f14222a;
    public final ta f14223b;

    public b9(ta taVar, int i7) {
        this.f14222a = i7;
        this.f14223b = taVar;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        int i7 = I0.f15883a;
        ta taVar = this.f14223b;
        taVar.Z = i7;
        taVar.f15388a0 = I0.f15884b;
        taVar.f15392b0 = I0.f15885c;
        taVar.f15396c0 = I0.d;
        taVar.f15428n.requestLayout();
        return r0.l1.f56267b;
    }

    @Override
    public void a(ez ezVar) {
        gf gfVar;
        ta taVar = this.f14223b;
        if (ezVar != null) {
            d7 d7Var = taVar.L1;
            if (d7Var != null && (gfVar = d7Var.f14364a1) != null) {
                ezVar.d(new org.telegram.ui.Cells.c5(gfVar));
                return;
            }
            return;
        }
        taVar.getClass();
    }

    @Override
    public void b(float f10) {
        ta taVar = this.f14223b;
        w9 w9Var = taVar.C0;
        if (w9Var != null) {
            taVar.U1 = f10;
            w9Var.setZoom(f10);
        }
        taVar.i0(true);
    }

    @Override
    public Bitmap c(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.f14223b.L1.L.getAbsolutePath(), options);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f14222a) {
            case 2:
                ta taVar = this.f14223b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26895b.getPackageName()));
                    taVar.f15391b.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 3:
                ta taVar2 = this.f14223b;
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26895b.getPackageName()));
                    taVar2.f15391b.startActivity(intent2);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 4:
            case 6:
            default:
                ta taVar3 = this.f14223b;
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26895b.getPackageName()));
                    taVar3.f15391b.startActivity(intent3);
                    return;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
            case 5:
                ta taVar4 = this.f14223b;
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26895b.getPackageName()));
                    taVar4.f15391b.startActivity(intent4);
                    return;
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                    return;
                }
            case 7:
                ta taVar5 = this.f14223b;
                int i10 = taVar5.f15395c;
                d7 d7Var = taVar5.L1;
                if (d7Var != null) {
                    d7Var.D0 = np.u1(i10).j5();
                    taVar5.W1 = !taVar5.L1.f14368c;
                    taVar5.h(null);
                    taVar5.k();
                    taVar5.l();
                    taVar5.x();
                    d7 d7Var2 = taVar5.L1;
                    d7Var2.i(true);
                    d7Var2.C0 = taVar5.f15400d1.getText();
                    taVar5.L1 = null;
                    taVar5.V(d7Var2, true);
                    a1 a1Var = np.u1(i10).R1().f12396w;
                    if (d7Var2.f14368c) {
                        a1Var.d(d7Var2);
                    } else {
                        ArrayList arrayList = a1Var.f14171b;
                        if (!d7Var2.f14404u) {
                            a1Var.e(d7Var2);
                            d7Var2.f14365b = Utilities.f22772b.nextLong();
                            z0 z0Var = new z0(d7Var2);
                            arrayList.remove(d7Var2);
                            arrayList.add(0, d7Var2);
                            a1Var.a(z0Var);
                        }
                    }
                    taVar5.J(0, true);
                    return;
                }
                return;
            case 8:
                ta taVar6 = this.f14223b;
                d7 d7Var3 = taVar6.L1;
                if (d7Var3 != null && !d7Var3.f14378g && ((!d7Var3.f14390n || d7Var3.f14404u) && d7Var3.f14368c)) {
                    np.u1(taVar6.f15395c).R1().f12396w.b(taVar6.L1);
                    taVar6.L1 = null;
                }
                d7 d7Var4 = taVar6.L1;
                if (d7Var4 != null && (d7Var4.f14392o || d7Var4.f14378g || (d7Var4.f14390n && !d7Var4.f14404u))) {
                    taVar6.p(true);
                    return;
                } else {
                    taVar6.J(0, true);
                    return;
                }
        }
    }

    @Override
    public void j(final o8 o8Var, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i7, q1 q1Var, final b0 b0Var) {
        switch (this.f14222a) {
            case 9:
                ArrayList arrayList = o8Var.f15151b;
                ta taVar = this.f14223b;
                if (taVar.L1 != null) {
                    taVar.Y0.x(5, true);
                    taVar.L1.E0 = o8Var;
                    int i10 = taVar.f15395c;
                    int i11 = r8.f15311a;
                    SerializedData serializedData = new SerializedData(true);
                    r8.c(serializedData, o8Var);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    r8.c(serializedData2, o8Var);
                    np.u1(i10).h7.edit().putString("story_privacy2", Utilities.f(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    d7 d7Var = taVar.L1;
                    d7Var.G0 = z12;
                    d7Var.H0 = z11;
                    d7Var.F0.clear();
                    taVar.L1.F0.addAll(arrayList);
                    d7 d7Var2 = taVar.L1;
                    d7Var2.f14387l = true;
                    d7Var2.f14406v0 = inputPeer;
                    ArrayList arrayList2 = taVar.I1;
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
                            d7Var3.f14387l = true;
                            d7Var3.f14406v0 = inputPeer;
                        }
                    }
                    taVar.h(new y8(taVar, q1Var, 0));
                    return;
                }
                return;
            default:
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final ta taVar2 = this.f14223b;
                c8.oa.b(strArr, new y10() {
                    @Override
                    public final void a(Object obj2) {
                        boolean z14;
                        final boolean z15;
                        TLRPC.InputPeer inputPeer2;
                        long e10;
                        final ta taVar3 = ta.this;
                        int i13 = taVar3.f15395c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final b0 b0Var2 = b0Var;
                        if (!booleanValue) {
                            b0Var2.run();
                            return;
                        }
                        w9 w9Var = taVar3.C0;
                        if (w9Var != null && !w9Var.isFrontface()) {
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
                            e10 = org.telegram.messenger.n5.n(inputPeer3);
                        } else {
                            e10 = k10.i(i13).e();
                        }
                        final long j3 = e10;
                        tL_startLive.privacy_rules.addAll(o8Var.f15151b);
                        tL_startLive.random_id = Utilities.f22772b.nextLong();
                        final boolean z16 = z13;
                        tL_startLive.rtmp_stream = z16;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i7);
                        ConnectionsManager.getInstance(i13).sendRequest(tL_startLive, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                org.telegram.messenger.g0.g3(new di.r7(ta.this, tLObject, tL_startLive, z16, j3, z15, tL_error, b0Var2));
                            }
                        });
                    }
                });
                return;
        }
    }

    @Override
    public void onCameraInit() {
        ta taVar = this.f14223b;
        String B = taVar.B();
        String str = null;
        if (TextUtils.equals(B, taVar.E())) {
            B = null;
        }
        if (taVar.f15409g0 == 0) {
            str = B;
        }
        taVar.d0(str);
        f81 f81Var = taVar.W0;
        if (f81Var != null) {
            taVar.U1 = 0.0f;
            f81Var.b(false, 0.0f);
        }
        taVar.l0(true);
    }
}

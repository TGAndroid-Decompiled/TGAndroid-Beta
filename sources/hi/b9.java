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
import org.telegram.messenger.ff;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.cz;
import org.telegram.ui.Components.u51;
public final class b9 implements CameraView.CameraViewDelegate, r0.m, org.telegram.ui.ActionBar.r1, b81, u51, w7, b7 {
    public final int f14276a;
    public final ta f14277b;

    public b9(ta taVar, int i7) {
        this.f14276a = i7;
        this.f14277b = taVar;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        int i7 = I0.f15892a;
        ta taVar = this.f14277b;
        taVar.Z = i7;
        taVar.f15424a0 = I0.f15893b;
        taVar.f15428b0 = I0.f15894c;
        taVar.f15432c0 = I0.d;
        taVar.f15464n.requestLayout();
        return r0.l1.f56257b;
    }

    @Override
    public void a(cz czVar) {
        ff ffVar;
        ta taVar = this.f14277b;
        if (czVar != null) {
            d7 d7Var = taVar.L1;
            if (d7Var != null && (ffVar = d7Var.f14390a1) != null) {
                czVar.d(new org.telegram.ui.Cells.b5(ffVar));
                return;
            }
            return;
        }
        taVar.getClass();
    }

    @Override
    public void b(float f10) {
        ta taVar = this.f14277b;
        w9 w9Var = taVar.C0;
        if (w9Var != null) {
            taVar.U1 = f10;
            w9Var.setZoom(f10);
        }
        taVar.i0(true);
    }

    @Override
    public Bitmap c(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.f14277b.L1.L.getAbsolutePath(), options);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f14276a) {
            case 2:
                ta taVar = this.f14277b;
                taVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26915b.getPackageName()));
                    taVar.f15427b.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 3:
                ta taVar2 = this.f14277b;
                taVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26915b.getPackageName()));
                    taVar2.f15427b.startActivity(intent2);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 4:
            case 6:
            default:
                ta taVar3 = this.f14277b;
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26915b.getPackageName()));
                    taVar3.f15427b.startActivity(intent3);
                    return;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
            case 5:
                ta taVar4 = this.f14277b;
                taVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26915b.getPackageName()));
                    taVar4.f15427b.startActivity(intent4);
                    return;
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                    return;
                }
            case 7:
                ta taVar5 = this.f14277b;
                int i10 = taVar5.f15431c;
                d7 d7Var = taVar5.L1;
                if (d7Var != null) {
                    d7Var.D0 = mp.u1(i10).j5();
                    taVar5.W1 = !taVar5.L1.f14394c;
                    taVar5.h(null);
                    taVar5.k();
                    taVar5.l();
                    taVar5.x();
                    d7 d7Var2 = taVar5.L1;
                    d7Var2.i(true);
                    d7Var2.C0 = taVar5.f15436d1.getText();
                    taVar5.L1 = null;
                    taVar5.V(d7Var2, true);
                    b1 b1Var = mp.u1(i10).R1().f12404w;
                    if (d7Var2.f14394c) {
                        b1Var.d(d7Var2);
                    } else {
                        ArrayList arrayList = b1Var.f14258b;
                        if (!d7Var2.f14430u) {
                            b1Var.e(d7Var2);
                            d7Var2.f14391b = Utilities.f22780b.nextLong();
                            a1 a1Var = new a1(d7Var2);
                            arrayList.remove(d7Var2);
                            arrayList.add(0, d7Var2);
                            b1Var.a(a1Var);
                        }
                    }
                    taVar5.J(0, true);
                    return;
                }
                return;
            case 8:
                ta taVar6 = this.f14277b;
                d7 d7Var3 = taVar6.L1;
                if (d7Var3 != null && !d7Var3.f14404g && ((!d7Var3.f14416n || d7Var3.f14430u) && d7Var3.f14394c)) {
                    mp.u1(taVar6.f15431c).R1().f12404w.b(taVar6.L1);
                    taVar6.L1 = null;
                }
                d7 d7Var4 = taVar6.L1;
                if (d7Var4 != null && (d7Var4.f14418o || d7Var4.f14404g || (d7Var4.f14416n && !d7Var4.f14430u))) {
                    taVar6.p(true);
                    return;
                } else {
                    taVar6.J(0, true);
                    return;
                }
        }
    }

    @Override
    public void i(final o8 o8Var, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i7, r1 r1Var, final k kVar) {
        switch (this.f14276a) {
            case 9:
                ArrayList arrayList = o8Var.f15196b;
                ta taVar = this.f14277b;
                if (taVar.L1 != null) {
                    taVar.Y0.x(5, true);
                    taVar.L1.E0 = o8Var;
                    int i10 = taVar.f15431c;
                    int i11 = r8.f15335a;
                    SerializedData serializedData = new SerializedData(true);
                    r8.c(serializedData, o8Var);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    r8.c(serializedData2, o8Var);
                    mp.u1(i10).h7.edit().putString("story_privacy2", Utilities.f(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    d7 d7Var = taVar.L1;
                    d7Var.G0 = z12;
                    d7Var.H0 = z11;
                    d7Var.F0.clear();
                    taVar.L1.F0.addAll(arrayList);
                    d7 d7Var2 = taVar.L1;
                    d7Var2.f14413l = true;
                    d7Var2.f14432v0 = inputPeer;
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
                            d7Var3.f14413l = true;
                            d7Var3.f14432v0 = inputPeer;
                        }
                    }
                    taVar.h(new y8(taVar, r1Var, 0));
                    return;
                }
                return;
            default:
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final ta taVar2 = this.f14277b;
                c8.na.b(strArr, new x10() {
                    @Override
                    public final void a(Object obj2) {
                        boolean z14;
                        final boolean z15;
                        TLRPC.InputPeer inputPeer2;
                        long e10;
                        final ta taVar3 = ta.this;
                        int i13 = taVar3.f15431c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final k kVar2 = kVar;
                        if (!booleanValue) {
                            kVar2.run();
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
                            e10 = j10.i(i13).e();
                        }
                        final long j3 = e10;
                        tL_startLive.privacy_rules.addAll(o8Var.f15196b);
                        tL_startLive.random_id = Utilities.f22780b.nextLong();
                        final boolean z16 = z13;
                        tL_startLive.rtmp_stream = z16;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i7);
                        ConnectionsManager.getInstance(i13).sendRequest(tL_startLive, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                org.telegram.messenger.g0.g3(new di.r7(ta.this, tLObject, tL_startLive, z16, j3, z15, tL_error, kVar2));
                            }
                        });
                    }
                });
                return;
        }
    }

    @Override
    public void onCameraInit() {
        ta taVar = this.f14277b;
        String B = taVar.B();
        String str = null;
        if (TextUtils.equals(B, taVar.E())) {
            B = null;
        }
        if (taVar.f15445g0 == 0) {
            str = B;
        }
        taVar.d0(str);
        c81 c81Var = taVar.W0;
        if (c81Var != null) {
            taVar.U1 = 0.0f;
            c81Var.b(false, 0.0f);
        }
        taVar.l0(true);
    }
}

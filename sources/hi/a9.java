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
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.x51;
public final class a9 implements CameraView.CameraViewDelegate, r0.m, org.telegram.ui.ActionBar.q1, e81, x51, v7, a7 {
    public final int f14254a;
    public final sa f14255b;

    public a9(sa saVar, int i7) {
        this.f14254a = i7;
        this.f14255b = saVar;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        int i7 = I0.f15914a;
        sa saVar = this.f14255b;
        saVar.Z = i7;
        saVar.f15382a0 = I0.f15915b;
        saVar.f15386b0 = I0.f15916c;
        saVar.f15390c0 = I0.d;
        saVar.f15422n.requestLayout();
        return r0.l1.f56298b;
    }

    @Override
    public void a(ez ezVar) {
        ff ffVar;
        sa saVar = this.f14255b;
        if (ezVar != null) {
            c7 c7Var = saVar.L1;
            if (c7Var != null && (ffVar = c7Var.f14337a1) != null) {
                ezVar.d(new org.telegram.ui.Cells.c5(ffVar));
                return;
            }
            return;
        }
        saVar.getClass();
    }

    @Override
    public void b(float f10) {
        sa saVar = this.f14255b;
        v9 v9Var = saVar.C0;
        if (v9Var != null) {
            saVar.U1 = f10;
            v9Var.setZoom(f10);
        }
        saVar.i0(true);
    }

    @Override
    public Bitmap c(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.f14255b.L1.L.getAbsolutePath(), options);
    }

    @Override
    public void g(final n8 n8Var, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i7, c cVar, final l lVar) {
        switch (this.f14254a) {
            case 9:
                ArrayList arrayList = n8Var.f15126b;
                sa saVar = this.f14255b;
                if (saVar.L1 != null) {
                    saVar.Y0.x(5, true);
                    saVar.L1.E0 = n8Var;
                    int i10 = saVar.f15389c;
                    int i11 = q8.f15311a;
                    SerializedData serializedData = new SerializedData(true);
                    q8.c(serializedData, n8Var);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    q8.c(serializedData2, n8Var);
                    mp.u1(i10).h7.edit().putString("story_privacy2", Utilities.f(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    c7 c7Var = saVar.L1;
                    c7Var.G0 = z12;
                    c7Var.H0 = z11;
                    c7Var.F0.clear();
                    saVar.L1.F0.addAll(arrayList);
                    c7 c7Var2 = saVar.L1;
                    c7Var2.f14360l = true;
                    c7Var2.f14379v0 = inputPeer;
                    ArrayList arrayList2 = saVar.I1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList2.get(i12);
                            i12++;
                            c7 c7Var3 = (c7) obj;
                            c7Var3.E0 = n8Var;
                            ArrayList arrayList3 = c7Var3.F0;
                            c7Var3.G0 = z12;
                            c7Var3.H0 = z11;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            c7Var3.f14360l = true;
                            c7Var3.f14379v0 = inputPeer;
                        }
                    }
                    saVar.h(new x8(saVar, cVar, 0));
                    return;
                }
                return;
            default:
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final sa saVar2 = this.f14255b;
                c8.na.b(strArr, new x10() {
                    @Override
                    public final void a(Object obj2) {
                        boolean z14;
                        final boolean z15;
                        TLRPC.InputPeer inputPeer2;
                        long e10;
                        final sa saVar3 = sa.this;
                        int i13 = saVar3.f15389c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final l lVar2 = lVar;
                        if (!booleanValue) {
                            lVar2.run();
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
                            e10 = org.telegram.messenger.n5.n(inputPeer3);
                        } else {
                            e10 = j10.i(i13).e();
                        }
                        final long j3 = e10;
                        tL_startLive.privacy_rules.addAll(n8Var.f15126b);
                        tL_startLive.random_id = Utilities.f22805b.nextLong();
                        final boolean z16 = z13;
                        tL_startLive.rtmp_stream = z16;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i7);
                        ConnectionsManager.getInstance(i13).sendRequest(tL_startLive, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                org.telegram.messenger.g0.g3(new di.r7(sa.this, tLObject, tL_startLive, z16, j3, z15, tL_error, lVar2));
                            }
                        });
                    }
                });
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f14254a) {
            case 2:
                sa saVar = this.f14255b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26941b.getPackageName()));
                    saVar.f15385b.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 3:
                sa saVar2 = this.f14255b;
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26941b.getPackageName()));
                    saVar2.f15385b.startActivity(intent2);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 4:
            case 6:
            default:
                sa saVar3 = this.f14255b;
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26941b.getPackageName()));
                    saVar3.f15385b.startActivity(intent3);
                    return;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
            case 5:
                sa saVar4 = this.f14255b;
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26941b.getPackageName()));
                    saVar4.f15385b.startActivity(intent4);
                    return;
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                    return;
                }
            case 7:
                sa saVar5 = this.f14255b;
                int i10 = saVar5.f15389c;
                c7 c7Var = saVar5.L1;
                if (c7Var != null) {
                    c7Var.D0 = mp.u1(i10).j5();
                    saVar5.W1 = !saVar5.L1.f14341c;
                    saVar5.h(null);
                    saVar5.k();
                    saVar5.l();
                    saVar5.x();
                    c7 c7Var2 = saVar5.L1;
                    c7Var2.i(true);
                    c7Var2.C0 = saVar5.f15394d1.getText();
                    saVar5.L1 = null;
                    saVar5.V(c7Var2, true);
                    b1 b1Var = mp.u1(i10).R1().f12441w;
                    if (c7Var2.f14341c) {
                        b1Var.d(c7Var2);
                    } else {
                        ArrayList arrayList = b1Var.f14280b;
                        if (!c7Var2.f14377u) {
                            b1Var.e(c7Var2);
                            c7Var2.f14338b = Utilities.f22805b.nextLong();
                            a1 a1Var = new a1(c7Var2);
                            arrayList.remove(c7Var2);
                            arrayList.add(0, c7Var2);
                            b1Var.a(a1Var);
                        }
                    }
                    saVar5.J(0, true);
                    return;
                }
                return;
            case 8:
                sa saVar6 = this.f14255b;
                c7 c7Var3 = saVar6.L1;
                if (c7Var3 != null && !c7Var3.f14351g && ((!c7Var3.f14363n || c7Var3.f14377u) && c7Var3.f14341c)) {
                    mp.u1(saVar6.f15389c).R1().f12441w.b(saVar6.L1);
                    saVar6.L1 = null;
                }
                c7 c7Var4 = saVar6.L1;
                if (c7Var4 != null && (c7Var4.f14365o || c7Var4.f14351g || (c7Var4.f14363n && !c7Var4.f14377u))) {
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
        sa saVar = this.f14255b;
        String B = saVar.B();
        String str = null;
        if (TextUtils.equals(B, saVar.E())) {
            B = null;
        }
        if (saVar.f15403g0 == 0) {
            str = B;
        }
        saVar.d0(str);
        f81 f81Var = saVar.W0;
        if (f81Var != null) {
            saVar.U1 = 0.0f;
            f81Var.b(false, 0.0f);
        }
        saVar.l0(true);
    }
}

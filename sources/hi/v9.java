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
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.w51;
public final class v9 implements CameraView.CameraViewDelegate, r0.m, org.telegram.ui.ActionBar.q1, f81, w51, q8, v7 {
    public final int f15607a;
    public final nb f15608b;

    public v9(nb nbVar, int i7) {
        this.f15607a = i7;
        this.f15608b = nbVar;
    }

    @Override
    public void a(bz bzVar) {
        ff ffVar;
        nb nbVar = this.f15608b;
        if (bzVar != null) {
            x7 x7Var = nbVar.L1;
            if (x7Var != null && (ffVar = x7Var.f15735a1) != null) {
                bzVar.d(new org.telegram.ui.ActionBar.i5(ffVar));
                return;
            }
            return;
        }
        nbVar.getClass();
    }

    @Override
    public Bitmap b(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.f15608b.L1.L.getAbsolutePath(), options);
    }

    @Override
    public void c(float f10) {
        nb nbVar = this.f15608b;
        qa qaVar = nbVar.C0;
        if (qaVar != null) {
            nbVar.U1 = f10;
            qaVar.setZoom(f10);
        }
        nbVar.i0(true);
    }

    @Override
    public void h(final i9 i9Var, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i7, c cVar, final w wVar) {
        switch (this.f15607a) {
            case 9:
                ArrayList arrayList = i9Var.f14702b;
                nb nbVar = this.f15608b;
                if (nbVar.L1 != null) {
                    nbVar.Y0.x(5, true);
                    nbVar.L1.E0 = i9Var;
                    int i10 = nbVar.f15062c;
                    int i11 = l9.f14846a;
                    SerializedData serializedData = new SerializedData(true);
                    l9.c(serializedData, i9Var);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    l9.c(serializedData2, i9Var);
                    mp.u1(i10).h7.edit().putString("story_privacy2", Utilities.f(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    x7 x7Var = nbVar.L1;
                    x7Var.G0 = z12;
                    x7Var.H0 = z11;
                    x7Var.F0.clear();
                    nbVar.L1.F0.addAll(arrayList);
                    x7 x7Var2 = nbVar.L1;
                    x7Var2.f15758l = true;
                    x7Var2.f15777v0 = inputPeer;
                    ArrayList arrayList2 = nbVar.I1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList2.get(i12);
                            i12++;
                            x7 x7Var3 = (x7) obj;
                            x7Var3.E0 = i9Var;
                            ArrayList arrayList3 = x7Var3.F0;
                            x7Var3.G0 = z12;
                            x7Var3.H0 = z11;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            x7Var3.f15758l = true;
                            x7Var3.f15777v0 = inputPeer;
                        }
                    }
                    nbVar.h(new s9(nbVar, cVar, 0));
                    return;
                }
                return;
            default:
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final nb nbVar2 = this.f15608b;
                c8.oa.b(strArr, new w10() {
                    @Override
                    public final void a(Object obj2) {
                        boolean z14;
                        final boolean z15;
                        TLRPC.InputPeer inputPeer2;
                        long e10;
                        final nb nbVar3 = nb.this;
                        int i13 = nbVar3.f15062c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final w wVar2 = wVar;
                        if (!booleanValue) {
                            wVar2.run();
                            return;
                        }
                        qa qaVar = nbVar3.C0;
                        if (qaVar != null && !qaVar.isFrontface()) {
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
                            e10 = i10.i(i13).e();
                        }
                        final long j3 = e10;
                        tL_startLive.privacy_rules.addAll(i9Var.f14702b);
                        tL_startLive.random_id = Utilities.f22875b.nextLong();
                        final boolean z16 = z13;
                        tL_startLive.rtmp_stream = z16;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i7);
                        ConnectionsManager.getInstance(i13).sendRequest(tL_startLive, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                org.telegram.messenger.g0.g3(new di.r7(nb.this, tLObject, tL_startLive, z16, j3, z15, tL_error, wVar2));
                            }
                        });
                    }
                });
                return;
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f15607a) {
            case 2:
                nb nbVar = this.f15608b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f27013b.getPackageName()));
                    nbVar.f15058b.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 3:
                nb nbVar2 = this.f15608b;
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + org.telegram.messenger.t0.f27013b.getPackageName()));
                    nbVar2.f15058b.startActivity(intent2);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 4:
            case 6:
            default:
                nb nbVar3 = this.f15608b;
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + org.telegram.messenger.t0.f27013b.getPackageName()));
                    nbVar3.f15058b.startActivity(intent3);
                    return;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
            case 5:
                nb nbVar4 = this.f15608b;
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + org.telegram.messenger.t0.f27013b.getPackageName()));
                    nbVar4.f15058b.startActivity(intent4);
                    return;
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                    return;
                }
            case 7:
                nb nbVar5 = this.f15608b;
                int i10 = nbVar5.f15062c;
                x7 x7Var = nbVar5.L1;
                if (x7Var != null) {
                    x7Var.D0 = mp.u1(i10).j5();
                    nbVar5.W1 = !nbVar5.L1.f15739c;
                    nbVar5.h(null);
                    nbVar5.k();
                    nbVar5.l();
                    nbVar5.x();
                    x7 x7Var2 = nbVar5.L1;
                    x7Var2.i(true);
                    x7Var2.C0 = nbVar5.f15067d1.getText();
                    nbVar5.L1 = null;
                    nbVar5.V(x7Var2, true);
                    j1 j1Var = mp.u1(i10).R1().f12406w;
                    if (x7Var2.f15739c) {
                        j1Var.d(x7Var2);
                    } else {
                        ArrayList arrayList = j1Var.f14719b;
                        if (!x7Var2.f15775u) {
                            j1Var.e(x7Var2);
                            x7Var2.f15736b = Utilities.f22875b.nextLong();
                            i1 i1Var = new i1(x7Var2);
                            arrayList.remove(x7Var2);
                            arrayList.add(0, x7Var2);
                            j1Var.a(i1Var);
                        }
                    }
                    nbVar5.J(0, true);
                    return;
                }
                return;
            case 8:
                nb nbVar6 = this.f15608b;
                x7 x7Var3 = nbVar6.L1;
                if (x7Var3 != null && !x7Var3.f15749g && ((!x7Var3.f15761n || x7Var3.f15775u) && x7Var3.f15739c)) {
                    mp.u1(nbVar6.f15062c).R1().f12406w.b(nbVar6.L1);
                    nbVar6.L1 = null;
                }
                x7 x7Var4 = nbVar6.L1;
                if (x7Var4 != null && (x7Var4.f15763o || x7Var4.f15749g || (x7Var4.f15761n && !x7Var4.f15775u))) {
                    nbVar6.p(true);
                    return;
                } else {
                    nbVar6.J(0, true);
                    return;
                }
        }
    }

    @Override
    public r0.l1 l1(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        int i7 = I0.f15978a;
        nb nbVar = this.f15608b;
        nbVar.Z = i7;
        nbVar.f15055a0 = I0.f15979b;
        nbVar.f15059b0 = I0.f15980c;
        nbVar.f15063c0 = I0.d;
        nbVar.f15095n.requestLayout();
        return r0.l1.f56380b;
    }

    @Override
    public void onCameraInit() {
        nb nbVar = this.f15608b;
        String B = nbVar.B();
        String str = null;
        if (TextUtils.equals(B, nbVar.E())) {
            B = null;
        }
        if (nbVar.f15076g0 == 0) {
            str = B;
        }
        nbVar.d0(str);
        g81 g81Var = nbVar.W0;
        if (g81Var != null) {
            nbVar.U1 = 0.0f;
            g81Var.b(false, 0.0f);
        }
        nbVar.l0(true);
    }
}

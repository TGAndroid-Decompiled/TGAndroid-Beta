package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class k6b implements CameraView.CameraViewDelegate, no7, ed, zyc, jac, h5b, d4b {
    public final byte a;
    public final t7b b;

    public k6b(t7b t7bVar, byte b) {
        this.a = b;
        this.b = t7bVar;
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        io5 H0 = gl.H0(vxcVar, false);
        int i = H0.a;
        t7b t7bVar = this.b;
        t7bVar.Z = i;
        t7bVar.a0 = H0.b;
        t7bVar.b0 = H0.c;
        t7bVar.c0 = H0.d;
        t7bVar.n.requestLayout();
        return vxc.b;
    }

    @Override
    public final void a(td4 td4Var) {
        f4b f4bVar;
        lm6 lm6Var;
        if (td4Var != null && (f4bVar = this.b.L1) != null && (lm6Var = f4bVar.a1) != null) {
            td4Var.c(new z24(lm6Var, (byte) 1));
        }
    }

    @Override
    public final void b(float f) {
        t7b t7bVar = this.b;
        y6b y6bVar = t7bVar.C0;
        if (y6bVar != null) {
            t7bVar.U1 = f;
            y6bVar.setZoom(f);
        }
        t7bVar.i0(true);
    }

    @Override
    public final void c(final w5b w5bVar, final boolean z, final boolean z2, boolean z3, final boolean z4, final TLRPC.InputPeer inputPeer, final int i, a5b a5bVar, final kya kyaVar) {
        int i2 = 0;
        switch (this.a) {
            case 9:
                ArrayList arrayList = w5bVar.b;
                t7b t7bVar = this.b;
                if (t7bVar.L1 != null) {
                    t7bVar.Y0.x(5, true);
                    t7bVar.L1.E0 = w5bVar;
                    int i3 = t7bVar.c;
                    int i4 = a6b.a;
                    SerializedData serializedData = new SerializedData(true);
                    a6b.c(serializedData, w5bVar);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    a6b.c(serializedData2, w5bVar);
                    na7.q1(i3).X3.edit().putString("story_privacy2", Utilities.f(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    f4b f4bVar = t7bVar.L1;
                    f4bVar.G0 = z3;
                    f4bVar.H0 = z2;
                    f4bVar.F0.clear();
                    t7bVar.L1.F0.addAll(arrayList);
                    f4b f4bVar2 = t7bVar.L1;
                    f4bVar2.l = true;
                    f4bVar2.v0 = inputPeer;
                    ArrayList arrayList2 = t7bVar.I1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        while (i2 < size) {
                            Object obj = arrayList2.get(i2);
                            i2++;
                            f4b f4bVar3 = (f4b) obj;
                            f4bVar3.E0 = w5bVar;
                            ArrayList arrayList3 = f4bVar3.F0;
                            f4bVar3.G0 = z3;
                            f4bVar3.H0 = z2;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            f4bVar3.l = true;
                            f4bVar3.v0 = inputPeer;
                        }
                    }
                    t7bVar.f(new a5b(t7bVar, a5bVar, (byte) 1));
                    return;
                }
                return;
            default:
                String[] strArr = z4 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final t7b t7bVar2 = this.b;
                rqe.b(strArr, strArr, new p8c() {
                    @Override
                    public final void a(Object obj2) {
                        boolean z5;
                        final boolean z6;
                        TLRPC.InputPeer inputPeer2;
                        long e;
                        final t7b t7bVar3 = t7b.this;
                        int i5 = t7bVar3.c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final kya kyaVar2 = kyaVar;
                        if (!booleanValue) {
                            kyaVar2.run();
                            return;
                        }
                        y6b y6bVar = t7bVar3.C0;
                        if (y6bVar != null && !y6bVar.isFrontface()) {
                            z6 = false;
                            z5 = true;
                        } else {
                            z5 = true;
                            z6 = true;
                        }
                        final TL_stories.TL_startLive tL_startLive = new TL_stories.TL_startLive();
                        tL_startLive.noforwards = z2 ^ z5;
                        TLRPC.InputPeer inputPeer3 = inputPeer;
                        if (inputPeer3 == null) {
                            inputPeer2 = new TLRPC.TL_inputPeerSelf();
                        } else {
                            inputPeer2 = inputPeer3;
                        }
                        tL_startLive.peer = inputPeer2;
                        if (inputPeer3 != null && !(inputPeer3 instanceof TLRPC.TL_inputPeerSelf)) {
                            e = cf3.m(inputPeer3);
                        } else {
                            e = y6c.h(i5).e();
                        }
                        final long j = e;
                        tL_startLive.privacy_rules.addAll(w5bVar.b);
                        tL_startLive.random_id = Utilities.b.nextLong();
                        final boolean z7 = z4;
                        tL_startLive.rtmp_stream = z7;
                        tL_startLive.messages_enabled = Boolean.valueOf(z);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i);
                        ConnectionsManager.getInstance(i5).sendRequest(tL_startLive, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                gl.d3(new gsa(t7b.this, tLObject, tL_startLive, z7, j, z6, tL_error, kyaVar2));
                            }
                        });
                    }
                });
                return;
        }
    }

    @Override
    public final Bitmap l(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.b.L1.L.getAbsolutePath(), options);
    }

    @Override
    public final void onCameraInit() {
        t7b t7bVar = this.b;
        String A = t7bVar.A();
        String str = null;
        if (TextUtils.equals(A, t7bVar.D())) {
            A = null;
        }
        if (t7bVar.g0 == 0) {
            str = A;
        }
        t7bVar.d0(str);
        azc azcVar = t7bVar.W0;
        if (azcVar != null) {
            t7bVar.U1 = 0.0f;
            azcVar.b(false, 0.0f);
        }
        t7bVar.l0(true);
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        f4b f4bVar = null;
        t7b t7bVar = this.b;
        switch (b) {
            case 2:
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    t7bVar.b.startActivity(intent);
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 3:
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + a.b.getPackageName()));
                    t7bVar.b.startActivity(intent2);
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
            case 4:
            case 6:
            default:
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + a.b.getPackageName()));
                    t7bVar.b.startActivity(intent3);
                    return;
                } catch (Exception e3) {
                    fa4.g(e3, true);
                    return;
                }
            case 5:
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + a.b.getPackageName()));
                    t7bVar.b.startActivity(intent4);
                    return;
                } catch (Exception e4) {
                    fa4.g(e4, true);
                    return;
                }
            case 7:
                int i2 = t7bVar.c;
                f4b f4bVar2 = t7bVar.L1;
                if (f4bVar2 != null) {
                    f4bVar2.D0 = na7.q1(i2).c5();
                    t7bVar.W1 = !t7bVar.L1.c;
                    t7bVar.f(null);
                    t7bVar.i();
                    t7bVar.j();
                    t7bVar.w();
                    f4b f4bVar3 = t7bVar.L1;
                    f4bVar3.i(true);
                    f4bVar3.C0 = t7bVar.d1.getText();
                    t7bVar.L1 = null;
                    t7bVar.V(f4bVar3, true);
                    jq3 jq3Var = na7.q1(i2).M1().w;
                    if (f4bVar3.c) {
                        jq3Var.d(f4bVar3);
                    } else {
                        ArrayList arrayList = jq3Var.b;
                        if (!f4bVar3.u) {
                            jq3Var.e(f4bVar3);
                            f4bVar3.b = Utilities.b.nextLong();
                            iq3 iq3Var = new iq3(f4bVar3);
                            arrayList.remove(f4bVar3);
                            arrayList.add(0, f4bVar3);
                            jq3Var.a(iq3Var);
                        }
                    }
                    t7bVar.I(0, true);
                    return;
                }
                return;
            case 8:
                f4b f4bVar4 = t7bVar.L1;
                if (f4bVar4 != null && !f4bVar4.g && ((!f4bVar4.n || f4bVar4.u) && f4bVar4.c)) {
                    na7.q1(t7bVar.c).M1().w.b(t7bVar.L1);
                    t7bVar.L1 = null;
                } else {
                    f4bVar = f4bVar4;
                }
                if (f4bVar != null && (f4bVar.o || f4bVar.g || (f4bVar.n && !f4bVar.u))) {
                    t7bVar.o(true);
                    return;
                } else {
                    t7bVar.I(0, true);
                    return;
                }
        }
    }
}

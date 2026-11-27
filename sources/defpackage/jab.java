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
public final class jab implements CameraView.CameraViewDelegate, nr7, fd, q3d, jec, f9b, a8b {
    public final byte a;
    public final rbb b;

    public jab(rbb rbbVar, byte b) {
        this.a = b;
        this.b = rbbVar;
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        mq5 H0 = hl.H0(l2dVar, false);
        int i = H0.a;
        rbb rbbVar = this.b;
        rbbVar.Z = i;
        rbbVar.a0 = H0.b;
        rbbVar.b0 = H0.c;
        rbbVar.c0 = H0.d;
        rbbVar.n.requestLayout();
        return l2d.b;
    }

    @Override
    public final void a(rf4 rf4Var) {
        c8b c8bVar;
        po6 po6Var;
        if (rf4Var != null && (c8bVar = this.b.L1) != null && (po6Var = c8bVar.a1) != null) {
            rf4Var.c(new ri6(po6Var, (byte) 29));
        }
    }

    @Override
    public final void b(float f) {
        rbb rbbVar = this.b;
        wab wabVar = rbbVar.C0;
        if (wabVar != null) {
            rbbVar.U1 = f;
            wabVar.setZoom(f);
        }
        rbbVar.i0(true);
    }

    @Override
    public final void c(final u9b u9bVar, final boolean z, final boolean z2, boolean z3, final boolean z4, final TLRPC.InputPeer inputPeer, final int i, z3b z3bVar, final s8b s8bVar) {
        int i2 = 0;
        switch (this.a) {
            case 9:
                ArrayList arrayList = u9bVar.b;
                rbb rbbVar = this.b;
                if (rbbVar.L1 != null) {
                    rbbVar.Y0.x(5, true);
                    rbbVar.L1.E0 = u9bVar;
                    int i3 = rbbVar.c;
                    int i4 = y9b.a;
                    SerializedData serializedData = new SerializedData(true);
                    y9b.c(serializedData, u9bVar);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    y9b.c(serializedData2, u9bVar);
                    uc7.s1(i3).X3.edit().putString("story_privacy2", Utilities.f(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    c8b c8bVar = rbbVar.L1;
                    c8bVar.G0 = z3;
                    c8bVar.H0 = z2;
                    c8bVar.F0.clear();
                    rbbVar.L1.F0.addAll(arrayList);
                    c8b c8bVar2 = rbbVar.L1;
                    c8bVar2.l = true;
                    c8bVar2.v0 = inputPeer;
                    ArrayList arrayList2 = rbbVar.I1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        while (i2 < size) {
                            Object obj = arrayList2.get(i2);
                            i2++;
                            c8b c8bVar3 = (c8b) obj;
                            c8bVar3.E0 = u9bVar;
                            ArrayList arrayList3 = c8bVar3.F0;
                            c8bVar3.G0 = z3;
                            c8bVar3.H0 = z2;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            c8bVar3.l = true;
                            c8bVar3.v0 = inputPeer;
                        }
                    }
                    rbbVar.f(new z3b(rbbVar, z3bVar, (byte) 29));
                    return;
                }
                return;
            default:
                String[] strArr = z4 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final rbb rbbVar2 = this.b;
                jve.b(strArr, strArr, new pcc() {
                    @Override
                    public final void a(Object obj2) {
                        boolean z5;
                        final boolean z6;
                        TLRPC.InputPeer inputPeer2;
                        long e;
                        final rbb rbbVar3 = rbb.this;
                        int i5 = rbbVar3.c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final s8b s8bVar2 = s8bVar;
                        if (!booleanValue) {
                            s8bVar2.run();
                            return;
                        }
                        wab wabVar = rbbVar3.C0;
                        if (wabVar != null && !wabVar.isFrontface()) {
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
                            e = wf3.m(inputPeer3);
                        } else {
                            e = yac.h(i5).e();
                        }
                        final long j = e;
                        tL_startLive.privacy_rules.addAll(u9bVar.b);
                        tL_startLive.random_id = Utilities.b.nextLong();
                        final boolean z7 = z4;
                        tL_startLive.rtmp_stream = z7;
                        tL_startLive.messages_enabled = Boolean.valueOf(z);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i);
                        ConnectionsManager.getInstance(i5).sendRequest(tL_startLive, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                hl.c3(new kwa(rbb.this, tLObject, tL_startLive, z7, j, z6, tL_error, s8bVar2));
                            }
                        });
                    }
                });
                return;
        }
    }

    @Override
    public final Bitmap i(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.b.L1.L.getAbsolutePath(), options);
    }

    @Override
    public final void onCameraInit() {
        rbb rbbVar = this.b;
        String A = rbbVar.A();
        String str = null;
        if (TextUtils.equals(A, rbbVar.D())) {
            A = null;
        }
        if (rbbVar.g0 == 0) {
            str = A;
        }
        rbbVar.d0(str);
        r3d r3dVar = rbbVar.W0;
        if (r3dVar != null) {
            rbbVar.U1 = 0.0f;
            r3dVar.b(false, 0.0f);
        }
        rbbVar.l0(true);
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        c8b c8bVar = null;
        rbb rbbVar = this.b;
        switch (b) {
            case 2:
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    rbbVar.b.startActivity(intent);
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 3:
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + a.b.getPackageName()));
                    rbbVar.b.startActivity(intent2);
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            case 4:
            case 6:
            default:
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + a.b.getPackageName()));
                    rbbVar.b.startActivity(intent3);
                    return;
                } catch (Exception e3) {
                    cc4.g(e3, true);
                    return;
                }
            case 5:
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + a.b.getPackageName()));
                    rbbVar.b.startActivity(intent4);
                    return;
                } catch (Exception e4) {
                    cc4.g(e4, true);
                    return;
                }
            case 7:
                int i2 = rbbVar.c;
                c8b c8bVar2 = rbbVar.L1;
                if (c8bVar2 != null) {
                    c8bVar2.D0 = uc7.s1(i2).l5();
                    rbbVar.W1 = !rbbVar.L1.c;
                    rbbVar.f(null);
                    rbbVar.i();
                    rbbVar.j();
                    rbbVar.w();
                    c8b c8bVar3 = rbbVar.L1;
                    c8bVar3.i(true);
                    c8bVar3.C0 = rbbVar.d1.getText();
                    rbbVar.L1 = null;
                    rbbVar.V(c8bVar3, true);
                    ar3 ar3Var = uc7.s1(i2).O1().w;
                    if (c8bVar3.c) {
                        ar3Var.d(c8bVar3);
                    } else {
                        ArrayList arrayList = ar3Var.b;
                        if (!c8bVar3.u) {
                            ar3Var.e(c8bVar3);
                            c8bVar3.b = Utilities.b.nextLong();
                            zq3 zq3Var = new zq3(c8bVar3);
                            arrayList.remove(c8bVar3);
                            arrayList.add(0, c8bVar3);
                            ar3Var.a(zq3Var);
                        }
                    }
                    rbbVar.I(0, true);
                    return;
                }
                return;
            case 8:
                c8b c8bVar4 = rbbVar.L1;
                if (c8bVar4 != null && !c8bVar4.g && ((!c8bVar4.n || c8bVar4.u) && c8bVar4.c)) {
                    uc7.s1(rbbVar.c).O1().w.b(rbbVar.L1);
                    rbbVar.L1 = null;
                } else {
                    c8bVar = c8bVar4;
                }
                if (c8bVar != null && (c8bVar.o || c8bVar.g || (c8bVar.n && !c8bVar.u))) {
                    rbbVar.o(true);
                    return;
                } else {
                    rbbVar.I(0, true);
                    return;
                }
        }
    }
}

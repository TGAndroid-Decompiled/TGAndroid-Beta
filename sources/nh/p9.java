package nh;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.yd0;
public final class p9 implements CameraView.CameraViewDelegate, r0.o, org.telegram.ui.ActionBar.b2, t81, Utilities.CallbackVoidReturn, k61, j8, m7 {
    public final int f18361a;
    public final gb f18362b;

    public p9(gb gbVar, int i10) {
        this.f18361a = i10;
        this.f18362b = gbVar;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.f8186a;
        gb gbVar = this.f18362b;
        gbVar.U = i10;
        gbVar.V = defaultWindowInsets.f8187b;
        gbVar.W = defaultWindowInsets.f8188c;
        gbVar.X = defaultWindowInsets.d;
        gbVar.f17777n.requestLayout();
        return r0.m1.f46842b;
    }

    @Override
    public void a(float f9) {
        gb gbVar = this.f18362b;
        ka kaVar = gbVar.f17812x0;
        if (kaVar != null) {
            gbVar.P1 = f9;
            kaVar.setZoom(f9);
        }
        gbVar.j0(true);
    }

    @Override
    public void b(qz qzVar) {
        MediaController.SavedFilterState savedFilterState;
        gb gbVar = this.f18362b;
        if (qzVar != null) {
            o7 o7Var = gbVar.G1;
            if (o7Var != null && (savedFilterState = o7Var.f18256a1) != null) {
                qzVar.f(new rz(savedFilterState));
                return;
            }
            return;
        }
        gbVar.getClass();
    }

    @Override
    public void e(final c9 c9Var, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i10, b6 b6Var, final m6 m6Var) {
        switch (this.f18361a) {
            case 10:
                ArrayList arrayList = c9Var.f17482b;
                gb gbVar = this.f18362b;
                if (gbVar.G1 != null) {
                    gbVar.T0.x(5, true);
                    gbVar.G1.E0 = c9Var;
                    int i11 = gbVar.f17743c;
                    int i12 = f9.f17679a;
                    SerializedData serializedData = new SerializedData(true);
                    f9.c(serializedData, c9Var);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    f9.c(serializedData2, c9Var);
                    MessagesController.getInstance(i11).getMainSettings().edit().putString("story_privacy2", Utilities.bytesToHex(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    o7 o7Var = gbVar.G1;
                    o7Var.G0 = z12;
                    o7Var.H0 = z11;
                    o7Var.F0.clear();
                    gbVar.G1.F0.addAll(arrayList);
                    o7 o7Var2 = gbVar.G1;
                    o7Var2.f18279l = true;
                    o7Var2.f18298v0 = inputPeer;
                    ArrayList arrayList2 = gbVar.D1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            o7 o7Var3 = (o7) obj;
                            o7Var3.E0 = c9Var;
                            ArrayList arrayList3 = o7Var3.F0;
                            o7Var3.G0 = z12;
                            o7Var3.H0 = z11;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            o7Var3.f18279l = true;
                            o7Var3.f18298v0 = inputPeer;
                        }
                    }
                    gbVar.i(new m9(gbVar, b6Var, 0));
                    return;
                }
                return;
            default:
                int i14 = R.raw.permission_request_camera;
                int i15 = R.string.PermissionNoCameraMicVideo;
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final gb gbVar2 = this.f18362b;
                yd0.d(i14, i15, strArr, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        final boolean z14;
                        TLRPC.InputPeer inputPeer2;
                        long clientUserId;
                        final gb gbVar3 = gb.this;
                        int i16 = gbVar3.f17743c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final m6 m6Var2 = m6Var;
                        if (!booleanValue) {
                            m6Var2.run();
                            return;
                        }
                        ka kaVar = gbVar3.f17812x0;
                        if (kaVar != null && !kaVar.isFrontface()) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        final TL_stories.TL_startLive tL_startLive = new TL_stories.TL_startLive();
                        tL_startLive.noforwards = true ^ z11;
                        TLRPC.InputPeer inputPeer3 = inputPeer;
                        if (inputPeer3 == null) {
                            inputPeer2 = new TLRPC.TL_inputPeerSelf();
                        } else {
                            inputPeer2 = inputPeer3;
                        }
                        tL_startLive.peer = inputPeer2;
                        if (inputPeer3 != null && !(inputPeer3 instanceof TLRPC.TL_inputPeerSelf)) {
                            clientUserId = DialogObject.getPeerDialogId(inputPeer3);
                        } else {
                            clientUserId = UserConfig.getInstance(i16).getClientUserId();
                        }
                        final long j10 = clientUserId;
                        tL_startLive.privacy_rules.addAll(c9Var.f17482b);
                        tL_startLive.random_id = Utilities.random.nextLong();
                        final boolean z15 = z13;
                        tL_startLive.rtmp_stream = z15;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(i16).sendRequest(tL_startLive, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new jh.i6(gb.this, tLObject, tL_startLive, z15, j10, z14, tL_error, m6Var2));
                            }
                        });
                    }
                });
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f18361a) {
            case 2:
                gb gbVar = this.f18362b;
                gbVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    gbVar.f17739b.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 3:
                gb gbVar2 = this.f18362b;
                gbVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    gbVar2.f17739b.startActivity(intent2);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 4:
            case 6:
            case 7:
            default:
                gb gbVar3 = this.f18362b;
                gbVar3.getClass();
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    gbVar3.f17739b.startActivity(intent3);
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 5:
                gb gbVar4 = this.f18362b;
                gbVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    gbVar4.f17739b.startActivity(intent4);
                    return;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return;
                }
            case 8:
                gb gbVar5 = this.f18362b;
                int i11 = gbVar5.f17743c;
                o7 o7Var = gbVar5.G1;
                if (o7Var != null) {
                    o7Var.D0 = MessagesController.getInstance(i11).storyEntitiesAllowed();
                    gbVar5.R1 = !gbVar5.G1.f18260c;
                    gbVar5.i(null);
                    gbVar5.l();
                    gbVar5.m();
                    gbVar5.y();
                    o7 o7Var2 = gbVar5.G1;
                    o7Var2.i(true);
                    o7Var2.C0 = gbVar5.Y0.getText();
                    gbVar5.G1 = null;
                    gbVar5.W(o7Var2, true);
                    a1 a1Var = MessagesController.getInstance(i11).getStoriesController().f16237w;
                    if (o7Var2.f18260c) {
                        a1Var.d(o7Var2);
                    } else {
                        ArrayList arrayList = a1Var.f17373b;
                        if (!o7Var2.f18296u) {
                            a1Var.e(o7Var2);
                            o7Var2.f18257b = Utilities.random.nextLong();
                            z0 z0Var = new z0(o7Var2);
                            arrayList.remove(o7Var2);
                            arrayList.add(0, o7Var2);
                            a1Var.a(z0Var);
                        }
                    }
                    gbVar5.K(0, true);
                    return;
                }
                return;
            case 9:
                gb gbVar6 = this.f18362b;
                o7 o7Var3 = gbVar6.G1;
                if (o7Var3 != null && !o7Var3.f18270g && ((!o7Var3.f18282n || o7Var3.f18296u) && o7Var3.f18260c)) {
                    MessagesController.getInstance(gbVar6.f17743c).getStoriesController().f16237w.c(gbVar6.G1);
                    gbVar6.G1 = null;
                }
                o7 o7Var4 = gbVar6.G1;
                if (o7Var4 != null && (o7Var4.f18284o || o7Var4.f18270g || (o7Var4.f18282n && !o7Var4.f18296u))) {
                    gbVar6.q(true);
                    return;
                } else {
                    gbVar6.K(0, true);
                    return;
                }
        }
    }

    @Override
    public Bitmap h(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.f18362b.G1.L.getAbsolutePath(), options);
    }

    @Override
    public void onCameraInit() {
        gb gbVar = this.f18362b;
        String C = gbVar.C();
        String str = null;
        if (TextUtils.equals(C, gbVar.F())) {
            C = null;
        }
        if (gbVar.f17740b0 == 0) {
            str = C;
        }
        gbVar.e0(str);
        u81 u81Var = gbVar.R0;
        if (u81Var != null) {
            gbVar.P1 = 0.0f;
            u81Var.b(0.0f, false);
        }
        gbVar.m0(true);
    }

    @Override
    public Object run() {
        Bitmap bitmap;
        va vaVar;
        gb gbVar = this.f18362b;
        ef0 ef0Var = gbVar.f17813x1;
        if (ef0Var != null) {
            bitmap = ef0Var.getUiBlurBitmap();
        } else {
            bitmap = null;
        }
        if (bitmap == null && (vaVar = gbVar.T0) != null && vaVar.getTextureView() != null) {
            return gbVar.T0.getTextureView().getUiBlurBitmap();
        }
        return bitmap;
    }
}

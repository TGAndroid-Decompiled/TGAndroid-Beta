package fi;

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
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.jc1;
import org.telegram.ui.Components.kc1;
import org.telegram.ui.Components.ye0;
public final class y9 implements CameraView.CameraViewDelegate, r0.n, org.telegram.ui.ActionBar.b2, jc1, Utilities.CallbackVoidReturn, h81, r8, u7 {
    public final int f12007a;
    public final sb f12008b;

    public y9(sb sbVar, int i10) {
        this.f12007a = i10;
        this.f12008b = sbVar;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        int i10 = defaultWindowInsets.f13449a;
        sb sbVar = this.f12008b;
        sbVar.Y = i10;
        sbVar.Z = defaultWindowInsets.f13450b;
        sbVar.f11605a0 = defaultWindowInsets.f13451c;
        sbVar.f11608b0 = defaultWindowInsets.d;
        sbVar.f11644n.requestLayout();
        return r0.k1.f47152b;
    }

    @Override
    public void a(float f7) {
        sb sbVar = this.f12008b;
        va vaVar = sbVar.B0;
        if (vaVar != null) {
            sbVar.T1 = f7;
            vaVar.setZoom(f7);
        }
        sbVar.i0(true);
    }

    @Override
    public void b(final l9 l9Var, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i10, e2.q0 q0Var, final di.s8 s8Var) {
        switch (this.f12007a) {
            case 10:
                ArrayList arrayList = l9Var.f11181b;
                sb sbVar = this.f12008b;
                if (sbVar.K1 != null) {
                    sbVar.X0.x(5, true);
                    sbVar.K1.E0 = l9Var;
                    int i11 = sbVar.f11611c;
                    int i12 = o9.f11421a;
                    SerializedData serializedData = new SerializedData(true);
                    o9.c(serializedData, l9Var);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    o9.c(serializedData2, l9Var);
                    MessagesController.getInstance(i11).getMainSettings().edit().putString("story_privacy2", Utilities.bytesToHex(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    w7 w7Var = sbVar.K1;
                    w7Var.G0 = z12;
                    w7Var.H0 = z11;
                    w7Var.F0.clear();
                    sbVar.K1.F0.addAll(arrayList);
                    w7 w7Var2 = sbVar.K1;
                    w7Var2.f11911l = true;
                    w7Var2.f11930v0 = inputPeer;
                    ArrayList arrayList2 = sbVar.H1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            w7 w7Var3 = (w7) obj;
                            w7Var3.E0 = l9Var;
                            ArrayList arrayList3 = w7Var3.F0;
                            w7Var3.G0 = z12;
                            w7Var3.H0 = z11;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            w7Var3.f11911l = true;
                            w7Var3.f11930v0 = inputPeer;
                        }
                    }
                    sbVar.h(new v9(sbVar, q0Var, 0));
                    return;
                }
                return;
            default:
                int i14 = R.raw.permission_request_camera;
                int i15 = R.string.PermissionNoCameraMicVideo;
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final sb sbVar2 = this.f12008b;
                ye0.b(i14, i15, strArr, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        boolean z14;
                        final boolean z15;
                        TLRPC.InputPeer inputPeer2;
                        long clientUserId;
                        final sb sbVar3 = sb.this;
                        int i16 = sbVar3.f11611c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final di.s8 s8Var2 = s8Var;
                        if (!booleanValue) {
                            s8Var2.run();
                            return;
                        }
                        va vaVar = sbVar3.B0;
                        if (vaVar != null && !vaVar.isFrontface()) {
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
                            clientUserId = DialogObject.getPeerDialogId(inputPeer3);
                        } else {
                            clientUserId = UserConfig.getInstance(i16).getClientUserId();
                        }
                        final long j10 = clientUserId;
                        tL_startLive.privacy_rules.addAll(l9Var.f11181b);
                        tL_startLive.random_id = Utilities.random.nextLong();
                        final boolean z16 = z13;
                        tL_startLive.rtmp_stream = z16;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(i16).sendRequest(tL_startLive, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new bi.o8(sb.this, tLObject, tL_startLive, z16, j10, z15, tL_error, s8Var2));
                            }
                        });
                    }
                });
                return;
        }
    }

    @Override
    public void d(e00 e00Var) {
        MediaController.SavedFilterState savedFilterState;
        sb sbVar = this.f12008b;
        if (e00Var != null) {
            w7 w7Var = sbVar.K1;
            if (w7Var != null && (savedFilterState = w7Var.f11889a1) != null) {
                e00Var.f(new f00(savedFilterState));
                return;
            }
            return;
        }
        sbVar.getClass();
    }

    @Override
    public Bitmap g(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.f12008b.K1.L.getAbsolutePath(), options);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f12007a) {
            case 2:
                sb sbVar = this.f12008b;
                sbVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    sbVar.f11607b.startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                sb sbVar2 = this.f12008b;
                sbVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    sbVar2.f11607b.startActivity(intent2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 4:
            case 6:
            case 7:
            default:
                sb sbVar3 = this.f12008b;
                sbVar3.getClass();
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    sbVar3.f11607b.startActivity(intent3);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 5:
                sb sbVar4 = this.f12008b;
                sbVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    sbVar4.f11607b.startActivity(intent4);
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 8:
                sb sbVar5 = this.f12008b;
                int i11 = sbVar5.f11611c;
                w7 w7Var = sbVar5.K1;
                if (w7Var != null) {
                    w7Var.D0 = MessagesController.getInstance(i11).storyEntitiesAllowed();
                    sbVar5.V1 = !sbVar5.K1.f11893c;
                    sbVar5.h(null);
                    sbVar5.k();
                    sbVar5.l();
                    sbVar5.x();
                    w7 w7Var2 = sbVar5.K1;
                    w7Var2.i(true);
                    w7Var2.C0 = sbVar5.f11613c1.getText();
                    sbVar5.K1 = null;
                    sbVar5.V(w7Var2, true);
                    a1 a1Var = MessagesController.getInstance(i11).getStoriesController().f8647w;
                    if (w7Var2.f11893c) {
                        a1Var.d(w7Var2);
                    } else {
                        ArrayList arrayList = a1Var.f10497b;
                        if (!w7Var2.f11928u) {
                            a1Var.e(w7Var2);
                            w7Var2.f11890b = Utilities.random.nextLong();
                            z0 z0Var = new z0(w7Var2);
                            arrayList.remove(w7Var2);
                            arrayList.add(0, w7Var2);
                            a1Var.a(z0Var);
                        }
                    }
                    sbVar5.J(0, true);
                    return;
                }
                return;
            case 9:
                sb sbVar6 = this.f12008b;
                w7 w7Var3 = sbVar6.K1;
                if (w7Var3 != null && !w7Var3.f11902g && ((!w7Var3.f11914n || w7Var3.f11928u) && w7Var3.f11893c)) {
                    MessagesController.getInstance(sbVar6.f11611c).getStoriesController().f8647w.b(sbVar6.K1);
                    sbVar6.K1 = null;
                }
                w7 w7Var4 = sbVar6.K1;
                if (w7Var4 != null && (w7Var4.f11916o || w7Var4.f11902g || (w7Var4.f11914n && !w7Var4.f11928u))) {
                    sbVar6.p(true);
                    return;
                } else {
                    sbVar6.J(0, true);
                    return;
                }
        }
    }

    @Override
    public void onCameraInit() {
        sb sbVar = this.f12008b;
        String B = sbVar.B();
        String str = null;
        if (TextUtils.equals(B, sbVar.E())) {
            B = null;
        }
        if (sbVar.f11622f0 == 0) {
            str = B;
        }
        sbVar.d0(str);
        kc1 kc1Var = sbVar.V0;
        if (kc1Var != null) {
            sbVar.T1 = 0.0f;
            kc1Var.b(0.0f, false);
        }
        sbVar.l0(true);
    }

    @Override
    public Object run() {
        Bitmap bitmap;
        gb gbVar;
        sb sbVar = this.f12008b;
        fg0 fg0Var = sbVar.B1;
        if (fg0Var != null) {
            bitmap = fg0Var.getUiBlurBitmap();
        } else {
            bitmap = null;
        }
        if (bitmap == null && (gbVar = sbVar.X0) != null && gbVar.getTextureView() != null) {
            return sbVar.X0.getTextureView().getUiBlurBitmap();
        }
        return bitmap;
    }
}

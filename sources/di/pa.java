package di;

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
import org.telegram.ui.Components.df0;
import org.telegram.ui.Components.ea1;
import org.telegram.ui.Components.fa1;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.i00;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.x71;
public final class pa implements CameraView.CameraViewDelegate, r0.n, org.telegram.ui.ActionBar.z1, ea1, Utilities.CallbackVoidReturn, x71, g9, i8 {
    public final int f7596a;
    public final kc f7597b;

    public pa(kc kcVar, int i10) {
        this.f7596a = i10;
        this.f7597b = kcVar;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.f10892a;
        kc kcVar = this.f7597b;
        kcVar.Y = i10;
        kcVar.Z = defaultWindowInsets.f10893b;
        kcVar.f7238a0 = defaultWindowInsets.f10894c;
        kcVar.f7241b0 = defaultWindowInsets.d;
        kcVar.f7277n.requestLayout();
        return r0.l1.f43496b;
    }

    @Override
    public void b(float f7) {
        kc kcVar = this.f7597b;
        nb nbVar = kcVar.B0;
        if (nbVar != null) {
            kcVar.T1 = f7;
            nbVar.setZoom(f7);
        }
        kcVar.i0(true);
    }

    @Override
    public void c(h00 h00Var) {
        MediaController.SavedFilterState savedFilterState;
        kc kcVar = this.f7597b;
        if (h00Var != null) {
            k8 k8Var = kcVar.K1;
            if (k8Var != null && (savedFilterState = k8Var.f7177a1) != null) {
                h00Var.f(new i00(savedFilterState));
                return;
            }
            return;
        }
        kcVar.getClass();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f7596a) {
            case 2:
                kc kcVar = this.f7597b;
                kcVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    kcVar.f7240b.startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                kc kcVar2 = this.f7597b;
                kcVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    kcVar2.f7240b.startActivity(intent2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 4:
            case 6:
            case 7:
            default:
                kc kcVar3 = this.f7597b;
                kcVar3.getClass();
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    kcVar3.f7240b.startActivity(intent3);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 5:
                kc kcVar4 = this.f7597b;
                kcVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    kcVar4.f7240b.startActivity(intent4);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 8:
                kc kcVar5 = this.f7597b;
                int i11 = kcVar5.f7244c;
                k8 k8Var = kcVar5.K1;
                if (k8Var != null) {
                    k8Var.D0 = MessagesController.getInstance(i11).storyEntitiesAllowed();
                    kcVar5.V1 = !kcVar5.K1.f7181c;
                    kcVar5.h(null);
                    kcVar5.k();
                    kcVar5.l();
                    kcVar5.x();
                    k8 k8Var2 = kcVar5.K1;
                    k8Var2.i(true);
                    k8Var2.C0 = kcVar5.f7246c1.getText();
                    kcVar5.K1 = null;
                    kcVar5.V(k8Var2, true);
                    a1 a1Var = MessagesController.getInstance(i11).getStoriesController().f3984w;
                    if (k8Var2.f7181c) {
                        a1Var.d(k8Var2);
                    } else {
                        ArrayList arrayList = a1Var.f6587b;
                        if (!k8Var2.f7216u) {
                            a1Var.e(k8Var2);
                            k8Var2.f7178b = Utilities.random.nextLong();
                            z0 z0Var = new z0(k8Var2);
                            arrayList.remove(k8Var2);
                            arrayList.add(0, k8Var2);
                            a1Var.a(z0Var);
                        }
                    }
                    kcVar5.J(0, true);
                    return;
                }
                return;
            case 9:
                kc kcVar6 = this.f7597b;
                k8 k8Var3 = kcVar6.K1;
                if (k8Var3 != null && !k8Var3.f7190g && ((!k8Var3.f7202n || k8Var3.f7216u) && k8Var3.f7181c)) {
                    MessagesController.getInstance(kcVar6.f7244c).getStoriesController().f3984w.b(kcVar6.K1);
                    kcVar6.K1 = null;
                }
                k8 k8Var4 = kcVar6.K1;
                if (k8Var4 != null && (k8Var4.f7204o || k8Var4.f7190g || (k8Var4.f7202n && !k8Var4.f7216u))) {
                    kcVar6.p(true);
                    return;
                } else {
                    kcVar6.J(0, true);
                    return;
                }
        }
    }

    @Override
    public Bitmap i(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.f7597b.K1.L.getAbsolutePath(), options);
    }

    @Override
    public void j(final ca caVar, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i10, y6 y6Var, final x8 x8Var) {
        switch (this.f7596a) {
            case 10:
                ArrayList arrayList = caVar.f6741b;
                kc kcVar = this.f7597b;
                if (kcVar.K1 != null) {
                    kcVar.X0.x(5, true);
                    kcVar.K1.E0 = caVar;
                    int i11 = kcVar.f7244c;
                    int i12 = fa.f6956a;
                    SerializedData serializedData = new SerializedData(true);
                    fa.c(serializedData, caVar);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    fa.c(serializedData2, caVar);
                    MessagesController.getInstance(i11).getMainSettings().edit().putString("story_privacy2", Utilities.bytesToHex(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    k8 k8Var = kcVar.K1;
                    k8Var.G0 = z12;
                    k8Var.H0 = z11;
                    k8Var.F0.clear();
                    kcVar.K1.F0.addAll(arrayList);
                    k8 k8Var2 = kcVar.K1;
                    k8Var2.f7199l = true;
                    k8Var2.f7218v0 = inputPeer;
                    ArrayList arrayList2 = kcVar.H1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            k8 k8Var3 = (k8) obj;
                            k8Var3.E0 = caVar;
                            ArrayList arrayList3 = k8Var3.F0;
                            k8Var3.G0 = z12;
                            k8Var3.H0 = z11;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            k8Var3.f7199l = true;
                            k8Var3.f7218v0 = inputPeer;
                        }
                    }
                    kcVar.h(new ma(kcVar, y6Var, 0));
                    return;
                }
                return;
            default:
                int i14 = R.raw.permission_request_camera;
                int i15 = R.string.PermissionNoCameraMicVideo;
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final kc kcVar2 = this.f7597b;
                df0.b(i14, i15, strArr, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        boolean z14;
                        final boolean z15;
                        TLRPC.InputPeer inputPeer2;
                        long clientUserId;
                        final kc kcVar3 = kc.this;
                        int i16 = kcVar3.f7244c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final x8 x8Var2 = x8Var;
                        if (!booleanValue) {
                            x8Var2.run();
                            return;
                        }
                        nb nbVar = kcVar3.B0;
                        if (nbVar != null && !nbVar.isFrontface()) {
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
                        tL_startLive.privacy_rules.addAll(caVar.f6741b);
                        tL_startLive.random_id = Utilities.random.nextLong();
                        final boolean z16 = z13;
                        tL_startLive.rtmp_stream = z16;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(i16).sendRequest(tL_startLive, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new ta(kc.this, tLObject, tL_startLive, z16, j10, z15, tL_error, x8Var2));
                            }
                        });
                    }
                });
                return;
        }
    }

    @Override
    public void onCameraInit() {
        kc kcVar = this.f7597b;
        String B = kcVar.B();
        String str = null;
        if (TextUtils.equals(B, kcVar.E())) {
            B = null;
        }
        if (kcVar.f7255f0 == 0) {
            str = B;
        }
        kcVar.d0(str);
        fa1 fa1Var = kcVar.V0;
        if (fa1Var != null) {
            kcVar.T1 = 0.0f;
            fa1Var.b(0.0f, false);
        }
        kcVar.l0(true);
    }

    @Override
    public Object run() {
        Bitmap bitmap;
        yb ybVar;
        kc kcVar = this.f7597b;
        jg0 jg0Var = kcVar.B1;
        if (jg0Var != null) {
            bitmap = jg0Var.getUiBlurBitmap();
        } else {
            bitmap = null;
        }
        if (bitmap == null && (ybVar = kcVar.X0) != null && ybVar.getTextureView() != null) {
            return kcVar.X0.getTextureView().getUiBlurBitmap();
        }
        return bitmap;
    }
}

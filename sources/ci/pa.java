package ci;

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
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.r91;
import org.telegram.ui.Components.s91;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.xz;
import org.telegram.ui.Components.yz;
public final class pa implements CameraView.CameraViewDelegate, r0.n, org.telegram.ui.ActionBar.b2, r91, Utilities.CallbackVoidReturn, j71, g9, i8 {
    public final int f5303a;
    public final kc f5304b;

    public pa(kc kcVar, int i10) {
        this.f5303a = i10;
        this.f5304b = kcVar;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.f10579a;
        kc kcVar = this.f5304b;
        kcVar.Y = i10;
        kcVar.Z = defaultWindowInsets.f10580b;
        kcVar.f4983a0 = defaultWindowInsets.f10581c;
        kcVar.f4986b0 = defaultWindowInsets.d;
        kcVar.f5022n.requestLayout();
        return r0.l1.f42184b;
    }

    @Override
    public void a(float f7) {
        kc kcVar = this.f5304b;
        nb nbVar = kcVar.B0;
        if (nbVar != null) {
            kcVar.T1 = f7;
            nbVar.setZoom(f7);
        }
        kcVar.j0(true);
    }

    @Override
    public void c(xz xzVar) {
        MediaController.SavedFilterState savedFilterState;
        kc kcVar = this.f5304b;
        if (xzVar != null) {
            k8 k8Var = kcVar.K1;
            if (k8Var != null && (savedFilterState = k8Var.f4922a1) != null) {
                xzVar.f(new yz(savedFilterState));
                return;
            }
            return;
        }
        kcVar.getClass();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f5303a) {
            case 2:
                kc kcVar = this.f5304b;
                kcVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    kcVar.f4985b.startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                kc kcVar2 = this.f5304b;
                kcVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    kcVar2.f4985b.startActivity(intent2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 4:
            case 6:
            case 7:
            default:
                kc kcVar3 = this.f5304b;
                kcVar3.getClass();
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    kcVar3.f4985b.startActivity(intent3);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 5:
                kc kcVar4 = this.f5304b;
                kcVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    kcVar4.f4985b.startActivity(intent4);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 8:
                kc kcVar5 = this.f5304b;
                int i11 = kcVar5.f4989c;
                k8 k8Var = kcVar5.K1;
                if (k8Var != null) {
                    k8Var.D0 = MessagesController.getInstance(i11).storyEntitiesAllowed();
                    kcVar5.V1 = !kcVar5.K1.f4926c;
                    kcVar5.i(null);
                    kcVar5.l();
                    kcVar5.m();
                    kcVar5.y();
                    k8 k8Var2 = kcVar5.K1;
                    k8Var2.i(true);
                    k8Var2.C0 = kcVar5.f4991c1.getText();
                    kcVar5.K1 = null;
                    kcVar5.W(k8Var2, true);
                    b1 b1Var = MessagesController.getInstance(i11).getStoriesController().f1212w;
                    if (k8Var2.f4926c) {
                        b1Var.d(k8Var2);
                    } else {
                        ArrayList arrayList = b1Var.f4372b;
                        if (!k8Var2.f4961u) {
                            b1Var.e(k8Var2);
                            k8Var2.f4923b = Utilities.random.nextLong();
                            a1 a1Var = new a1(k8Var2);
                            arrayList.remove(k8Var2);
                            arrayList.add(0, k8Var2);
                            b1Var.a(a1Var);
                        }
                    }
                    kcVar5.K(0, true);
                    return;
                }
                return;
            case 9:
                kc kcVar6 = this.f5304b;
                k8 k8Var3 = kcVar6.K1;
                if (k8Var3 != null && !k8Var3.f4935g && ((!k8Var3.f4947n || k8Var3.f4961u) && k8Var3.f4926c)) {
                    MessagesController.getInstance(kcVar6.f4989c).getStoriesController().f1212w.b(kcVar6.K1);
                    kcVar6.K1 = null;
                }
                k8 k8Var4 = kcVar6.K1;
                if (k8Var4 != null && (k8Var4.f4949o || k8Var4.f4935g || (k8Var4.f4947n && !k8Var4.f4961u))) {
                    kcVar6.q(true);
                    return;
                } else {
                    kcVar6.K(0, true);
                    return;
                }
        }
    }

    @Override
    public Bitmap i(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.f5304b.K1.L.getAbsolutePath(), options);
    }

    @Override
    public void k(final ca caVar, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i10, x8 x8Var, final androidx.fragment.app.a0 a0Var) {
        switch (this.f5303a) {
            case 10:
                ArrayList arrayList = caVar.f4478b;
                kc kcVar = this.f5304b;
                if (kcVar.K1 != null) {
                    kcVar.X0.x(5, true);
                    kcVar.K1.E0 = caVar;
                    int i11 = kcVar.f4989c;
                    int i12 = fa.f4710a;
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
                    k8Var2.f4944l = true;
                    k8Var2.f4963v0 = inputPeer;
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
                            k8Var3.f4944l = true;
                            k8Var3.f4963v0 = inputPeer;
                        }
                    }
                    kcVar.i(new ma(kcVar, x8Var, 0));
                    return;
                }
                return;
            default:
                int i14 = R.raw.permission_request_camera;
                int i15 = R.string.PermissionNoCameraMicVideo;
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final kc kcVar2 = this.f5304b;
                ne0.d(i14, i15, strArr, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        final boolean z14;
                        TLRPC.InputPeer inputPeer2;
                        long clientUserId;
                        final kc kcVar3 = kc.this;
                        int i16 = kcVar3.f4989c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final androidx.fragment.app.a0 a0Var2 = a0Var;
                        if (!booleanValue) {
                            a0Var2.run();
                            return;
                        }
                        nb nbVar = kcVar3.B0;
                        if (nbVar != null && !nbVar.isFrontface()) {
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
                        final long j3 = clientUserId;
                        tL_startLive.privacy_rules.addAll(caVar.f4478b);
                        tL_startLive.random_id = Utilities.random.nextLong();
                        final boolean z15 = z13;
                        tL_startLive.rtmp_stream = z15;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(i16).sendRequest(tL_startLive, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new ta(kc.this, tLObject, tL_startLive, z15, j3, z14, tL_error, a0Var2));
                            }
                        });
                    }
                });
                return;
        }
    }

    @Override
    public void onCameraInit() {
        kc kcVar = this.f5304b;
        String C = kcVar.C();
        String str = null;
        if (TextUtils.equals(C, kcVar.F())) {
            C = null;
        }
        if (kcVar.f5000f0 == 0) {
            str = C;
        }
        kcVar.e0(str);
        s91 s91Var = kcVar.V0;
        if (s91Var != null) {
            kcVar.T1 = 0.0f;
            s91Var.b(0.0f, false);
        }
        kcVar.m0(true);
    }

    @Override
    public Object run() {
        Bitmap bitmap;
        yb ybVar;
        kc kcVar = this.f5304b;
        tf0 tf0Var = kcVar.B1;
        if (tf0Var != null) {
            bitmap = tf0Var.getUiBlurBitmap();
        } else {
            bitmap = null;
        }
        if (bitmap == null && (ybVar = kcVar.X0) != null && ybVar.getTextureView() != null) {
            return kcVar.X0.getTextureView().getUiBlurBitmap();
        }
        return bitmap;
    }
}

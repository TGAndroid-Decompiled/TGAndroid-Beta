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
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.p91;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.xz;
public final class qa implements CameraView.CameraViewDelegate, r0.n, org.telegram.ui.ActionBar.z1, p91, Utilities.CallbackVoidReturn, h71, h9, j8 {
    public final int f5384a;
    public final lc f5385b;

    public qa(lc lcVar, int i10) {
        this.f5384a = i10;
        this.f5385b = lcVar;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.f10576a;
        lc lcVar = this.f5385b;
        lcVar.Y = i10;
        lcVar.Z = defaultWindowInsets.f10577b;
        lcVar.f5027a0 = defaultWindowInsets.f10578c;
        lcVar.f5030b0 = defaultWindowInsets.d;
        lcVar.f5066n.requestLayout();
        return r0.l1.f42125b;
    }

    @Override
    public void a(float f7) {
        lc lcVar = this.f5385b;
        ob obVar = lcVar.B0;
        if (obVar != null) {
            lcVar.T1 = f7;
            obVar.setZoom(f7);
        }
        lcVar.j0(true);
    }

    @Override
    public void c(wz wzVar) {
        MediaController.SavedFilterState savedFilterState;
        lc lcVar = this.f5385b;
        if (wzVar != null) {
            l8 l8Var = lcVar.K1;
            if (l8Var != null && (savedFilterState = l8Var.f4966a1) != null) {
                wzVar.f(new xz(savedFilterState));
                return;
            }
            return;
        }
        lcVar.getClass();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f5384a) {
            case 2:
                lc lcVar = this.f5385b;
                lcVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    lcVar.f5029b.startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                lc lcVar2 = this.f5385b;
                lcVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    lcVar2.f5029b.startActivity(intent2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 4:
            case 6:
            case 7:
            default:
                lc lcVar3 = this.f5385b;
                lcVar3.getClass();
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    lcVar3.f5029b.startActivity(intent3);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 5:
                lc lcVar4 = this.f5385b;
                lcVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    lcVar4.f5029b.startActivity(intent4);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 8:
                lc lcVar5 = this.f5385b;
                int i11 = lcVar5.f5033c;
                l8 l8Var = lcVar5.K1;
                if (l8Var != null) {
                    l8Var.D0 = MessagesController.getInstance(i11).storyEntitiesAllowed();
                    lcVar5.V1 = !lcVar5.K1.f4970c;
                    lcVar5.i(null);
                    lcVar5.l();
                    lcVar5.m();
                    lcVar5.y();
                    l8 l8Var2 = lcVar5.K1;
                    l8Var2.i(true);
                    l8Var2.C0 = lcVar5.f5035c1.getText();
                    lcVar5.K1 = null;
                    lcVar5.W(l8Var2, true);
                    b1 b1Var = MessagesController.getInstance(i11).getStoriesController().f1210w;
                    if (l8Var2.f4970c) {
                        b1Var.d(l8Var2);
                    } else {
                        ArrayList arrayList = b1Var.f4368b;
                        if (!l8Var2.f5005u) {
                            b1Var.e(l8Var2);
                            l8Var2.f4967b = Utilities.random.nextLong();
                            a1 a1Var = new a1(l8Var2);
                            arrayList.remove(l8Var2);
                            arrayList.add(0, l8Var2);
                            b1Var.a(a1Var);
                        }
                    }
                    lcVar5.K(0, true);
                    return;
                }
                return;
            case 9:
                lc lcVar6 = this.f5385b;
                l8 l8Var3 = lcVar6.K1;
                if (l8Var3 != null && !l8Var3.f4979g && ((!l8Var3.f4991n || l8Var3.f5005u) && l8Var3.f4970c)) {
                    MessagesController.getInstance(lcVar6.f5033c).getStoriesController().f1210w.b(lcVar6.K1);
                    lcVar6.K1 = null;
                }
                l8 l8Var4 = lcVar6.K1;
                if (l8Var4 != null && (l8Var4.f4993o || l8Var4.f4979g || (l8Var4.f4991n && !l8Var4.f5005u))) {
                    lcVar6.q(true);
                    return;
                } else {
                    lcVar6.K(0, true);
                    return;
                }
        }
    }

    @Override
    public Bitmap g(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.f5385b.K1.L.getAbsolutePath(), options);
    }

    @Override
    public void k(final da daVar, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i10, y8 y8Var, final androidx.fragment.app.a0 a0Var) {
        switch (this.f5384a) {
            case 10:
                ArrayList arrayList = daVar.f4547b;
                lc lcVar = this.f5385b;
                if (lcVar.K1 != null) {
                    lcVar.X0.x(5, true);
                    lcVar.K1.E0 = daVar;
                    int i11 = lcVar.f5033c;
                    int i12 = ga.f4733a;
                    SerializedData serializedData = new SerializedData(true);
                    ga.c(serializedData, daVar);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    ga.c(serializedData2, daVar);
                    MessagesController.getInstance(i11).getMainSettings().edit().putString("story_privacy2", Utilities.bytesToHex(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    l8 l8Var = lcVar.K1;
                    l8Var.G0 = z12;
                    l8Var.H0 = z11;
                    l8Var.F0.clear();
                    lcVar.K1.F0.addAll(arrayList);
                    l8 l8Var2 = lcVar.K1;
                    l8Var2.f4988l = true;
                    l8Var2.f5007v0 = inputPeer;
                    ArrayList arrayList2 = lcVar.H1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            l8 l8Var3 = (l8) obj;
                            l8Var3.E0 = daVar;
                            ArrayList arrayList3 = l8Var3.F0;
                            l8Var3.G0 = z12;
                            l8Var3.H0 = z11;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            l8Var3.f4988l = true;
                            l8Var3.f5007v0 = inputPeer;
                        }
                    }
                    lcVar.i(new na(lcVar, y8Var, 0));
                    return;
                }
                return;
            default:
                int i14 = R.raw.permission_request_camera;
                int i15 = R.string.PermissionNoCameraMicVideo;
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final lc lcVar2 = this.f5385b;
                ne0.d(i14, i15, strArr, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        final boolean z14;
                        TLRPC.InputPeer inputPeer2;
                        long clientUserId;
                        final lc lcVar3 = lc.this;
                        int i16 = lcVar3.f5033c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final androidx.fragment.app.a0 a0Var2 = a0Var;
                        if (!booleanValue) {
                            a0Var2.run();
                            return;
                        }
                        ob obVar = lcVar3.B0;
                        if (obVar != null && !obVar.isFrontface()) {
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
                        tL_startLive.privacy_rules.addAll(daVar.f4547b);
                        tL_startLive.random_id = Utilities.random.nextLong();
                        final boolean z15 = z13;
                        tL_startLive.rtmp_stream = z15;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(i16).sendRequest(tL_startLive, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new ua(lc.this, tLObject, tL_startLive, z15, j3, z14, tL_error, a0Var2));
                            }
                        });
                    }
                });
                return;
        }
    }

    @Override
    public void onCameraInit() {
        lc lcVar = this.f5385b;
        String C = lcVar.C();
        String str = null;
        if (TextUtils.equals(C, lcVar.F())) {
            C = null;
        }
        if (lcVar.f5044f0 == 0) {
            str = C;
        }
        lcVar.e0(str);
        q91 q91Var = lcVar.V0;
        if (q91Var != null) {
            lcVar.T1 = 0.0f;
            q91Var.b(0.0f, false);
        }
        lcVar.m0(true);
    }

    @Override
    public Object run() {
        Bitmap bitmap;
        zb zbVar;
        lc lcVar = this.f5385b;
        tf0 tf0Var = lcVar.B1;
        if (tf0Var != null) {
            bitmap = tf0Var.getUiBlurBitmap();
        } else {
            bitmap = null;
        }
        if (bitmap == null && (zbVar = lcVar.X0) != null && zbVar.getTextureView() != null) {
            return lcVar.X0.getTextureView().getUiBlurBitmap();
        }
        return bitmap;
    }
}

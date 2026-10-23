package ei;

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
import org.telegram.ui.Components.dg0;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.x91;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.Components.y91;
public final class ca implements CameraView.CameraViewDelegate, r0.n, org.telegram.ui.ActionBar.a2, x91, Utilities.CallbackVoidReturn, q71, v8, y7 {
    public final int f8839a;
    public final vb f8840b;

    public ca(vb vbVar, int i10) {
        this.f8839a = i10;
        this.f8840b = vbVar;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        int i10 = defaultWindowInsets.f12283a;
        vb vbVar = this.f8840b;
        vbVar.Y = i10;
        vbVar.Z = defaultWindowInsets.f12284b;
        vbVar.f9948a0 = defaultWindowInsets.f12285c;
        vbVar.f9951b0 = defaultWindowInsets.d;
        vbVar.f9987n.requestLayout();
        return r0.k1.f44838b;
    }

    @Override
    public void b(float f7) {
        vb vbVar = this.f8840b;
        ya yaVar = vbVar.B0;
        if (yaVar != null) {
            vbVar.T1 = f7;
            yaVar.setZoom(f7);
        }
        vbVar.i0(true);
    }

    @Override
    public void c(e00 e00Var) {
        MediaController.SavedFilterState savedFilterState;
        vb vbVar = this.f8840b;
        if (e00Var != null) {
            a8 a8Var = vbVar.K1;
            if (a8Var != null && (savedFilterState = a8Var.f8696a1) != null) {
                e00Var.f(new f00(savedFilterState));
                return;
            }
            return;
        }
        vbVar.getClass();
    }

    @Override
    public void e(final p9 p9Var, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i10, p6 p6Var, final com.google.firebase.messaging.s sVar) {
        switch (this.f8839a) {
            case 10:
                ArrayList arrayList = p9Var.f9600b;
                vb vbVar = this.f8840b;
                if (vbVar.K1 != null) {
                    vbVar.X0.x(5, true);
                    vbVar.K1.E0 = p9Var;
                    int i11 = vbVar.f9954c;
                    int i12 = s9.f9817a;
                    SerializedData serializedData = new SerializedData(true);
                    s9.c(serializedData, p9Var);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    s9.c(serializedData2, p9Var);
                    MessagesController.getInstance(i11).getMainSettings().edit().putString("story_privacy2", Utilities.bytesToHex(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    a8 a8Var = vbVar.K1;
                    a8Var.G0 = z12;
                    a8Var.H0 = z11;
                    a8Var.F0.clear();
                    vbVar.K1.F0.addAll(arrayList);
                    a8 a8Var2 = vbVar.K1;
                    a8Var2.f8718l = true;
                    a8Var2.f8737v0 = inputPeer;
                    ArrayList arrayList2 = vbVar.H1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            a8 a8Var3 = (a8) obj;
                            a8Var3.E0 = p9Var;
                            ArrayList arrayList3 = a8Var3.F0;
                            a8Var3.G0 = z12;
                            a8Var3.H0 = z11;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            a8Var3.f8718l = true;
                            a8Var3.f8737v0 = inputPeer;
                        }
                    }
                    vbVar.h(new z9(vbVar, p6Var, 0));
                    return;
                }
                return;
            default:
                int i14 = R.raw.permission_request_camera;
                int i15 = R.string.PermissionNoCameraMicVideo;
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final vb vbVar2 = this.f8840b;
                xe0.b(i14, i15, strArr, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        boolean z14;
                        final boolean z15;
                        TLRPC.InputPeer inputPeer2;
                        long clientUserId;
                        final vb vbVar3 = vb.this;
                        int i16 = vbVar3.f9954c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final com.google.firebase.messaging.s sVar2 = sVar;
                        if (!booleanValue) {
                            sVar2.run();
                            return;
                        }
                        ya yaVar = vbVar3.B0;
                        if (yaVar != null && !yaVar.isFrontface()) {
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
                        tL_startLive.privacy_rules.addAll(p9Var.f9600b);
                        tL_startLive.random_id = Utilities.random.nextLong();
                        final boolean z16 = z13;
                        tL_startLive.rtmp_stream = z16;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(i16).sendRequest(tL_startLive, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new ai.s8(vb.this, tLObject, tL_startLive, z16, j10, z15, tL_error, sVar2));
                            }
                        });
                    }
                });
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f8839a) {
            case 2:
                vb vbVar = this.f8840b;
                vbVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    vbVar.f9950b.startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                vb vbVar2 = this.f8840b;
                vbVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    vbVar2.f9950b.startActivity(intent2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 4:
            case 6:
            case 7:
            default:
                vb vbVar3 = this.f8840b;
                vbVar3.getClass();
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    vbVar3.f9950b.startActivity(intent3);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 5:
                vb vbVar4 = this.f8840b;
                vbVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    vbVar4.f9950b.startActivity(intent4);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 8:
                vb vbVar5 = this.f8840b;
                int i11 = vbVar5.f9954c;
                a8 a8Var = vbVar5.K1;
                if (a8Var != null) {
                    a8Var.D0 = MessagesController.getInstance(i11).storyEntitiesAllowed();
                    vbVar5.V1 = !vbVar5.K1.f8700c;
                    vbVar5.h(null);
                    vbVar5.k();
                    vbVar5.l();
                    vbVar5.x();
                    a8 a8Var2 = vbVar5.K1;
                    a8Var2.i(true);
                    a8Var2.C0 = vbVar5.f9956c1.getText();
                    vbVar5.K1 = null;
                    vbVar5.V(a8Var2, true);
                    a1 a1Var = MessagesController.getInstance(i11).getStoriesController().f5509w;
                    if (a8Var2.f8700c) {
                        a1Var.d(a8Var2);
                    } else {
                        ArrayList arrayList = a1Var.f8673b;
                        if (!a8Var2.f8735u) {
                            a1Var.e(a8Var2);
                            a8Var2.f8697b = Utilities.random.nextLong();
                            z0 z0Var = new z0(a8Var2);
                            arrayList.remove(a8Var2);
                            arrayList.add(0, a8Var2);
                            a1Var.a(z0Var);
                        }
                    }
                    vbVar5.J(0, true);
                    return;
                }
                return;
            case 9:
                vb vbVar6 = this.f8840b;
                a8 a8Var3 = vbVar6.K1;
                if (a8Var3 != null && !a8Var3.f8709g && ((!a8Var3.f8721n || a8Var3.f8735u) && a8Var3.f8700c)) {
                    MessagesController.getInstance(vbVar6.f9954c).getStoriesController().f5509w.b(vbVar6.K1);
                    vbVar6.K1 = null;
                }
                a8 a8Var4 = vbVar6.K1;
                if (a8Var4 != null && (a8Var4.f8723o || a8Var4.f8709g || (a8Var4.f8721n && !a8Var4.f8735u))) {
                    vbVar6.p(true);
                    return;
                } else {
                    vbVar6.J(0, true);
                    return;
                }
        }
    }

    @Override
    public Bitmap k(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.f8840b.K1.L.getAbsolutePath(), options);
    }

    @Override
    public void onCameraInit() {
        vb vbVar = this.f8840b;
        String B = vbVar.B();
        String str = null;
        if (TextUtils.equals(B, vbVar.E())) {
            B = null;
        }
        if (vbVar.f9965f0 == 0) {
            str = B;
        }
        vbVar.d0(str);
        y91 y91Var = vbVar.V0;
        if (y91Var != null) {
            vbVar.T1 = 0.0f;
            y91Var.b(0.0f, false);
        }
        vbVar.l0(true);
    }

    @Override
    public Object run() {
        Bitmap bitmap;
        jb jbVar;
        vb vbVar = this.f8840b;
        dg0 dg0Var = vbVar.B1;
        if (dg0Var != null) {
            bitmap = dg0Var.getUiBlurBitmap();
        } else {
            bitmap = null;
        }
        if (bitmap == null && (jbVar = vbVar.X0) != null && jbVar.getTextureView() != null) {
            return vbVar.X0.getTextureView().getUiBlurBitmap();
        }
        return bitmap;
    }
}

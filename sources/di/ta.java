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
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.wz;
public final class ta implements CameraView.CameraViewDelegate, r0.n, org.telegram.ui.ActionBar.a2, c91, Utilities.CallbackVoidReturn, t61, j9, m8 {
    public final int f8202a;
    public final pc f8203b;

    public ta(pc pcVar, int i10) {
        this.f8202a = i10;
        this.f8203b = pcVar;
    }

    @Override
    public r0.l1 T0(View view, r0.l1 l1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.f11425a;
        pc pcVar = this.f8203b;
        pcVar.Y = i10;
        pcVar.Z = defaultWindowInsets.f11426b;
        pcVar.f7842a0 = defaultWindowInsets.f11427c;
        pcVar.f7845b0 = defaultWindowInsets.d;
        pcVar.f7882n.requestLayout();
        return r0.l1.f44710b;
    }

    @Override
    public void b(float f7) {
        pc pcVar = this.f8203b;
        sb sbVar = pcVar.B0;
        if (sbVar != null) {
            pcVar.T1 = f7;
            sbVar.setZoom(f7);
        }
        pcVar.j0(true);
    }

    @Override
    public void c(vz vzVar) {
        MediaController.SavedFilterState savedFilterState;
        pc pcVar = this.f8203b;
        if (vzVar != null) {
            o8 o8Var = pcVar.K1;
            if (o8Var != null && (savedFilterState = o8Var.f7742a1) != null) {
                vzVar.f(new wz(savedFilterState));
                return;
            }
            return;
        }
        pcVar.getClass();
    }

    @Override
    public Bitmap d(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.f8203b.K1.L.getAbsolutePath(), options);
    }

    @Override
    public void e(final ga gaVar, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i10, b7 b7Var, final bi.oa oaVar) {
        switch (this.f8202a) {
            case 10:
                ArrayList arrayList = gaVar.f7299b;
                pc pcVar = this.f8203b;
                if (pcVar.K1 != null) {
                    pcVar.X0.x(5, true);
                    pcVar.K1.E0 = gaVar;
                    int i11 = pcVar.f7848c;
                    int i12 = ja.f7442a;
                    SerializedData serializedData = new SerializedData(true);
                    ja.c(serializedData, gaVar);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    ja.c(serializedData2, gaVar);
                    MessagesController.getInstance(i11).getMainSettings().edit().putString("story_privacy2", Utilities.bytesToHex(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    o8 o8Var = pcVar.K1;
                    o8Var.G0 = z12;
                    o8Var.H0 = z11;
                    o8Var.F0.clear();
                    pcVar.K1.F0.addAll(arrayList);
                    o8 o8Var2 = pcVar.K1;
                    o8Var2.f7765l = true;
                    o8Var2.f7784v0 = inputPeer;
                    ArrayList arrayList2 = pcVar.H1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            o8 o8Var3 = (o8) obj;
                            o8Var3.E0 = gaVar;
                            ArrayList arrayList3 = o8Var3.F0;
                            o8Var3.G0 = z12;
                            o8Var3.H0 = z11;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            o8Var3.f7765l = true;
                            o8Var3.f7784v0 = inputPeer;
                        }
                    }
                    pcVar.i(new qa(pcVar, b7Var, 0));
                    return;
                }
                return;
            default:
                int i14 = R.raw.permission_request_camera;
                int i15 = R.string.PermissionNoCameraMicVideo;
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final pc pcVar2 = this.f8203b;
                de0.d(i14, i15, strArr, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        final boolean z14;
                        TLRPC.InputPeer inputPeer2;
                        long clientUserId;
                        final pc pcVar3 = pc.this;
                        int i16 = pcVar3.f7848c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final bi.oa oaVar2 = oaVar;
                        if (!booleanValue) {
                            oaVar2.run();
                            return;
                        }
                        sb sbVar = pcVar3.B0;
                        if (sbVar != null && !sbVar.isFrontface()) {
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
                        tL_startLive.privacy_rules.addAll(gaVar.f7299b);
                        tL_startLive.random_id = Utilities.random.nextLong();
                        final boolean z15 = z13;
                        tL_startLive.rtmp_stream = z15;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(i16).sendRequest(tL_startLive, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new xa(pc.this, tLObject, tL_startLive, z15, j3, z14, tL_error, oaVar2));
                            }
                        });
                    }
                });
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f8202a) {
            case 2:
                pc pcVar = this.f8203b;
                pcVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    pcVar.f7844b.startActivity(intent);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 3:
                pc pcVar2 = this.f8203b;
                pcVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    pcVar2.f7844b.startActivity(intent2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 4:
            case 6:
            case 7:
            default:
                pc pcVar3 = this.f8203b;
                pcVar3.getClass();
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    pcVar3.f7844b.startActivity(intent3);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 5:
                pc pcVar4 = this.f8203b;
                pcVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    pcVar4.f7844b.startActivity(intent4);
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 8:
                pc pcVar5 = this.f8203b;
                int i11 = pcVar5.f7848c;
                o8 o8Var = pcVar5.K1;
                if (o8Var != null) {
                    o8Var.D0 = MessagesController.getInstance(i11).storyEntitiesAllowed();
                    pcVar5.V1 = !pcVar5.K1.f7746c;
                    pcVar5.i(null);
                    pcVar5.l();
                    pcVar5.m();
                    pcVar5.y();
                    o8 o8Var2 = pcVar5.K1;
                    o8Var2.i(true);
                    o8Var2.C0 = pcVar5.f7850c1.getText();
                    pcVar5.K1 = null;
                    pcVar5.W(o8Var2, true);
                    b1 b1Var = MessagesController.getInstance(i11).getStoriesController().f3824w;
                    if (o8Var2.f7746c) {
                        b1Var.d(o8Var2);
                    } else {
                        ArrayList arrayList = b1Var.f6935b;
                        if (!o8Var2.f7782u) {
                            b1Var.e(o8Var2);
                            o8Var2.f7743b = Utilities.random.nextLong();
                            a1 a1Var = new a1(o8Var2);
                            arrayList.remove(o8Var2);
                            arrayList.add(0, o8Var2);
                            b1Var.a(a1Var);
                        }
                    }
                    pcVar5.K(0, true);
                    return;
                }
                return;
            case 9:
                pc pcVar6 = this.f8203b;
                o8 o8Var3 = pcVar6.K1;
                if (o8Var3 != null && !o8Var3.f7756g && ((!o8Var3.f7768n || o8Var3.f7782u) && o8Var3.f7746c)) {
                    MessagesController.getInstance(pcVar6.f7848c).getStoriesController().f3824w.b(pcVar6.K1);
                    pcVar6.K1 = null;
                }
                o8 o8Var4 = pcVar6.K1;
                if (o8Var4 != null && (o8Var4.f7770o || o8Var4.f7756g || (o8Var4.f7768n && !o8Var4.f7782u))) {
                    pcVar6.q(true);
                    return;
                } else {
                    pcVar6.K(0, true);
                    return;
                }
        }
    }

    @Override
    public void onCameraInit() {
        pc pcVar = this.f8203b;
        String C = pcVar.C();
        String str = null;
        if (TextUtils.equals(C, pcVar.F())) {
            C = null;
        }
        if (pcVar.f7860f0 == 0) {
            str = C;
        }
        pcVar.e0(str);
        d91 d91Var = pcVar.V0;
        if (d91Var != null) {
            pcVar.T1 = 0.0f;
            d91Var.b(0.0f, false);
        }
        pcVar.m0(true);
    }

    @Override
    public Object run() {
        Bitmap bitmap;
        dc dcVar;
        pc pcVar = this.f8203b;
        jf0 jf0Var = pcVar.B1;
        if (jf0Var != null) {
            bitmap = jf0Var.getUiBlurBitmap();
        } else {
            bitmap = null;
        }
        if (bitmap == null && (dcVar = pcVar.X0) != null && dcVar.getTextureView() != null) {
            return pcVar.X0.getTextureView().getUiBlurBitmap();
        }
        return bitmap;
    }
}

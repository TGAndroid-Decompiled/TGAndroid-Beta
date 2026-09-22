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
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.oe0;
import org.telegram.ui.Components.s91;
import org.telegram.ui.Components.t91;
import org.telegram.ui.Components.uf0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.wz;
public final class ta implements CameraView.CameraViewDelegate, r0.n, org.telegram.ui.ActionBar.a2, s91, Utilities.CallbackVoidReturn, k71, k9, m8 {
    public final int f5574a;
    public final oc f5575b;

    public ta(oc ocVar, int i10) {
        this.f5574a = i10;
        this.f5575b = ocVar;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.f10592a;
        oc ocVar = this.f5575b;
        ocVar.Y = i10;
        ocVar.Z = defaultWindowInsets.f10593b;
        ocVar.f5204a0 = defaultWindowInsets.f10594c;
        ocVar.f5207b0 = defaultWindowInsets.d;
        ocVar.f5243n.requestLayout();
        return r0.l1.f42174b;
    }

    @Override
    public void a(float f7) {
        oc ocVar = this.f5575b;
        rb rbVar = ocVar.B0;
        if (rbVar != null) {
            ocVar.T1 = f7;
            rbVar.setZoom(f7);
        }
        ocVar.j0(true);
    }

    @Override
    public void b(vz vzVar) {
        MediaController.SavedFilterState savedFilterState;
        oc ocVar = this.f5575b;
        if (vzVar != null) {
            o8 o8Var = ocVar.K1;
            if (o8Var != null && (savedFilterState = o8Var.f5143a1) != null) {
                vzVar.f(new wz(savedFilterState));
                return;
            }
            return;
        }
        ocVar.getClass();
    }

    @Override
    public Bitmap c(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.f5575b.K1.L.getAbsolutePath(), options);
    }

    @Override
    public void g(final ga gaVar, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i10, b9 b9Var, final androidx.fragment.app.a0 a0Var) {
        switch (this.f5574a) {
            case 10:
                ArrayList arrayList = gaVar.f4725b;
                oc ocVar = this.f5575b;
                if (ocVar.K1 != null) {
                    ocVar.X0.x(5, true);
                    ocVar.K1.E0 = gaVar;
                    int i11 = ocVar.f5210c;
                    int i12 = ja.f4857a;
                    SerializedData serializedData = new SerializedData(true);
                    ja.c(serializedData, gaVar);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    ja.c(serializedData2, gaVar);
                    MessagesController.getInstance(i11).getMainSettings().edit().putString("story_privacy2", Utilities.bytesToHex(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    o8 o8Var = ocVar.K1;
                    o8Var.G0 = z12;
                    o8Var.H0 = z11;
                    o8Var.F0.clear();
                    ocVar.K1.F0.addAll(arrayList);
                    o8 o8Var2 = ocVar.K1;
                    o8Var2.f5165l = true;
                    o8Var2.f5184v0 = inputPeer;
                    ArrayList arrayList2 = ocVar.H1;
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
                            o8Var3.f5165l = true;
                            o8Var3.f5184v0 = inputPeer;
                        }
                    }
                    ocVar.i(new qa(ocVar, b9Var, 0));
                    return;
                }
                return;
            default:
                int i14 = R.raw.permission_request_camera;
                int i15 = R.string.PermissionNoCameraMicVideo;
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final oc ocVar2 = this.f5575b;
                oe0.d(i14, i15, strArr, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        final boolean z14;
                        TLRPC.InputPeer inputPeer2;
                        long clientUserId;
                        final oc ocVar3 = oc.this;
                        int i16 = ocVar3.f5210c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final androidx.fragment.app.a0 a0Var2 = a0Var;
                        if (!booleanValue) {
                            a0Var2.run();
                            return;
                        }
                        rb rbVar = ocVar3.B0;
                        if (rbVar != null && !rbVar.isFrontface()) {
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
                        tL_startLive.privacy_rules.addAll(gaVar.f4725b);
                        tL_startLive.random_id = Utilities.random.nextLong();
                        final boolean z15 = z13;
                        tL_startLive.rtmp_stream = z15;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(i16).sendRequest(tL_startLive, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new xa(oc.this, tLObject, tL_startLive, z15, j3, z14, tL_error, a0Var2));
                            }
                        });
                    }
                });
                return;
        }
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f5574a) {
            case 2:
                oc ocVar = this.f5575b;
                ocVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    ocVar.f5206b.startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                oc ocVar2 = this.f5575b;
                ocVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    ocVar2.f5206b.startActivity(intent2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 4:
            case 6:
            case 7:
            default:
                oc ocVar3 = this.f5575b;
                ocVar3.getClass();
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    ocVar3.f5206b.startActivity(intent3);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 5:
                oc ocVar4 = this.f5575b;
                ocVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    ocVar4.f5206b.startActivity(intent4);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 8:
                oc ocVar5 = this.f5575b;
                int i11 = ocVar5.f5210c;
                o8 o8Var = ocVar5.K1;
                if (o8Var != null) {
                    o8Var.D0 = MessagesController.getInstance(i11).storyEntitiesAllowed();
                    ocVar5.V1 = !ocVar5.K1.f5147c;
                    ocVar5.i(null);
                    ocVar5.l();
                    ocVar5.m();
                    ocVar5.y();
                    o8 o8Var2 = ocVar5.K1;
                    o8Var2.i(true);
                    o8Var2.C0 = ocVar5.f5212c1.getText();
                    ocVar5.K1 = null;
                    ocVar5.W(o8Var2, true);
                    b1 b1Var = MessagesController.getInstance(i11).getStoriesController().f1208w;
                    if (o8Var2.f5147c) {
                        b1Var.d(o8Var2);
                    } else {
                        ArrayList arrayList = b1Var.f4381b;
                        if (!o8Var2.f5182u) {
                            b1Var.e(o8Var2);
                            o8Var2.f5144b = Utilities.random.nextLong();
                            a1 a1Var = new a1(o8Var2);
                            arrayList.remove(o8Var2);
                            arrayList.add(0, o8Var2);
                            b1Var.a(a1Var);
                        }
                    }
                    ocVar5.K(0, true);
                    return;
                }
                return;
            case 9:
                oc ocVar6 = this.f5575b;
                o8 o8Var3 = ocVar6.K1;
                if (o8Var3 != null && !o8Var3.f5156g && ((!o8Var3.f5168n || o8Var3.f5182u) && o8Var3.f5147c)) {
                    MessagesController.getInstance(ocVar6.f5210c).getStoriesController().f1208w.b(ocVar6.K1);
                    ocVar6.K1 = null;
                }
                o8 o8Var4 = ocVar6.K1;
                if (o8Var4 != null && (o8Var4.f5170o || o8Var4.f5156g || (o8Var4.f5168n && !o8Var4.f5182u))) {
                    ocVar6.q(true);
                    return;
                } else {
                    ocVar6.K(0, true);
                    return;
                }
        }
    }

    @Override
    public void onCameraInit() {
        oc ocVar = this.f5575b;
        String C = ocVar.C();
        String str = null;
        if (TextUtils.equals(C, ocVar.F())) {
            C = null;
        }
        if (ocVar.f5221f0 == 0) {
            str = C;
        }
        ocVar.e0(str);
        t91 t91Var = ocVar.V0;
        if (t91Var != null) {
            ocVar.T1 = 0.0f;
            t91Var.b(0.0f, false);
        }
        ocVar.m0(true);
    }

    @Override
    public Object run() {
        Bitmap bitmap;
        cc ccVar;
        oc ocVar = this.f5575b;
        uf0 uf0Var = ocVar.B1;
        if (uf0Var != null) {
            bitmap = uf0Var.getUiBlurBitmap();
        } else {
            bitmap = null;
        }
        if (bitmap == null && (ccVar = ocVar.X0) != null && ccVar.getTextureView() != null) {
            return ocVar.X0.getTextureView().getUiBlurBitmap();
        }
        return bitmap;
    }
}

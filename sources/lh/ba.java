package lh;

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
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.pd0;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.z51;

public final class ba implements CameraView.CameraViewDelegate, r0.o, org.telegram.ui.ActionBar.a2, j81, Utilities.CallbackVoidReturn, z51, u8, x7 {

    public final int f15695a;

    public final sb f15696b;

    public ba(sb sbVar, int i10) {
        this.f15695a = i10;
        this.f15696b = sbVar;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.f10489a;
        sb sbVar = this.f15696b;
        sbVar.U = i10;
        sbVar.V = defaultWindowInsets.f10490b;
        sbVar.W = defaultWindowInsets.f10491c;
        sbVar.X = defaultWindowInsets.d;
        sbVar.f16783n.requestLayout();
        return r0.m1.f46618b;
    }

    @Override
    public void b(float f10) {
        sb sbVar = this.f15696b;
        wa waVar = sbVar.f16818x0;
        if (waVar != null) {
            sbVar.P1 = f10;
            waVar.setZoom(f10);
        }
        sbVar.j0(true);
    }

    @Override
    public void c(jz jzVar) {
        MediaController.SavedFilterState savedFilterState;
        sb sbVar = this.f15696b;
        if (jzVar == null) {
            sbVar.getClass();
            return;
        }
        z7 z7Var = sbVar.G1;
        if (z7Var == null || (savedFilterState = z7Var.f17195a1) == null) {
            return;
        }
        jzVar.f(new kz(savedFilterState));
    }

    @Override
    public void d(final o9 o9Var, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i10, k7 k7Var, final kh.c cVar) {
        switch (this.f15695a) {
            case 10:
                ArrayList arrayList = o9Var.f16490b;
                sb sbVar = this.f15696b;
                if (sbVar.G1 != null) {
                    sbVar.T0.x(5, true);
                    sbVar.G1.E0 = o9Var;
                    int i11 = sbVar.f16749c;
                    int i12 = r9.f16677a;
                    SerializedData serializedData = new SerializedData(true);
                    r9.c(serializedData, o9Var);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    r9.c(serializedData2, o9Var);
                    MessagesController.getInstance(i11).getMainSettings().edit().putString("story_privacy2", Utilities.bytesToHex(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    z7 z7Var = sbVar.G1;
                    z7Var.G0 = z12;
                    z7Var.H0 = z11;
                    z7Var.F0.clear();
                    sbVar.G1.F0.addAll(arrayList);
                    z7 z7Var2 = sbVar.G1;
                    z7Var2.f17218l = true;
                    z7Var2.f17237v0 = inputPeer;
                    ArrayList arrayList2 = sbVar.D1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            z7 z7Var3 = (z7) obj;
                            z7Var3.E0 = o9Var;
                            ArrayList arrayList3 = z7Var3.F0;
                            z7Var3.G0 = z12;
                            z7Var3.H0 = z11;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            z7Var3.f17218l = true;
                            z7Var3.f17237v0 = inputPeer;
                        }
                    }
                    sbVar.i(new y9(sbVar, k7Var, 0));
                    break;
                }
                break;
            default:
                int i14 = R.raw.permission_request_camera;
                int i15 = R.string.PermissionNoCameraMicVideo;
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final sb sbVar2 = this.f15696b;
                pd0.d(i14, i15, strArr, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        final sb sbVar3 = sbVar2;
                        int i16 = sbVar3.f16749c;
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        final kh.c cVar2 = cVar;
                        if (!zBooleanValue) {
                            cVar2.run();
                            return;
                        }
                        wa waVar = sbVar3.f16818x0;
                        final boolean z14 = waVar == null || waVar.isFrontface();
                        final TL_stories.TL_startLive tL_startLive = new TL_stories.TL_startLive();
                        tL_startLive.noforwards = true ^ z11;
                        TLRPC.InputPeer inputPeer2 = inputPeer;
                        tL_startLive.peer = inputPeer2 == null ? new TLRPC.TL_inputPeerSelf() : inputPeer2;
                        final long clientUserId = (inputPeer2 == null || (inputPeer2 instanceof TLRPC.TL_inputPeerSelf)) ? UserConfig.getInstance(i16).getClientUserId() : DialogObject.getPeerDialogId(inputPeer2);
                        tL_startLive.privacy_rules.addAll(o9Var.f16490b);
                        tL_startLive.random_id = Utilities.random.nextLong();
                        final boolean z15 = z13;
                        tL_startLive.rtmp_stream = z15;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(i16).sendRequest(tL_startLive, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new hh.k6(sbVar3, tLObject, tL_startLive, z15, clientUserId, z14, tL_error, cVar2));
                            }
                        });
                    }
                });
                break;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f15695a) {
            case 2:
                sb sbVar = this.f15696b;
                sbVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    sbVar.f16745b.startActivity(intent);
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            case 3:
                sb sbVar2 = this.f15696b;
                sbVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    sbVar2.f16745b.startActivity(intent2);
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            case 4:
            case 6:
            case 7:
            default:
                sb sbVar3 = this.f15696b;
                sbVar3.getClass();
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    sbVar3.f16745b.startActivity(intent3);
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                break;
            case 5:
                sb sbVar4 = this.f15696b;
                sbVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    sbVar4.f16745b.startActivity(intent4);
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
                break;
            case 8:
                sb sbVar5 = this.f15696b;
                int i11 = sbVar5.f16749c;
                z7 z7Var = sbVar5.G1;
                if (z7Var != null) {
                    z7Var.D0 = MessagesController.getInstance(i11).storyEntitiesAllowed();
                    sbVar5.R1 = !sbVar5.G1.f17199c;
                    sbVar5.i(null);
                    sbVar5.l();
                    sbVar5.m();
                    sbVar5.y();
                    z7 z7Var2 = sbVar5.G1;
                    z7Var2.i(true);
                    z7Var2.C0 = sbVar5.Y0.getText();
                    sbVar5.G1 = null;
                    sbVar5.W(z7Var2, true);
                    a1 a1Var = MessagesController.getInstance(i11).getStoriesController().f13974w;
                    if (z7Var2.f17199c) {
                        a1Var.d(z7Var2);
                    } else {
                        ArrayList arrayList = a1Var.f15625b;
                        if (!z7Var2.f17235u) {
                            a1Var.e(z7Var2);
                            z7Var2.f17196b = Utilities.random.nextLong();
                            z0 z0Var = new z0(z7Var2);
                            arrayList.remove(z7Var2);
                            arrayList.add(0, z7Var2);
                            a1Var.a(z0Var);
                        }
                    }
                    sbVar5.K(0, true);
                    break;
                }
                break;
            case 9:
                sb sbVar6 = this.f15696b;
                z7 z7Var3 = sbVar6.G1;
                if (z7Var3 != null && !z7Var3.f17209g && ((!z7Var3.f17221n || z7Var3.f17235u) && z7Var3.f17199c)) {
                    MessagesController.getInstance(sbVar6.f16749c).getStoriesController().f13974w.c(sbVar6.G1);
                    sbVar6.G1 = null;
                }
                z7 z7Var4 = sbVar6.G1;
                if (z7Var4 != null && (z7Var4.f17223o || z7Var4.f17209g || (z7Var4.f17221n && !z7Var4.f17235u))) {
                    sbVar6.q(true);
                } else {
                    sbVar6.K(0, true);
                }
                break;
        }
    }

    @Override
    public Bitmap h(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.f15696b.G1.L.getAbsolutePath(), options);
    }

    @Override
    public void onCameraInit() {
        sb sbVar = this.f15696b;
        String strC = sbVar.C();
        if (TextUtils.equals(strC, sbVar.F())) {
            strC = null;
        }
        sbVar.e0(sbVar.f16746b0 == 0 ? strC : null);
        k81 k81Var = sbVar.R0;
        if (k81Var != null) {
            sbVar.P1 = 0.0f;
            k81Var.b(0.0f, false);
        }
        sbVar.m0(true);
    }

    @Override
    public Object run() {
        hb hbVar;
        sb sbVar = this.f15696b;
        ve0 ve0Var = sbVar.f16819x1;
        Bitmap uiBlurBitmap = ve0Var != null ? ve0Var.getUiBlurBitmap() : null;
        return (uiBlurBitmap != null || (hbVar = sbVar.T0) == null || hbVar.getTextureView() == null) ? uiBlurBitmap : sbVar.T0.getTextureView().getUiBlurBitmap();
    }
}

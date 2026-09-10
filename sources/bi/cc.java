package bi;

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
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.p91;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.sf0;
public final class cc implements CameraView.CameraViewDelegate, r0.n, org.telegram.ui.ActionBar.c2, p91, Utilities.CallbackVoidReturn, g71, ma, p9 {
    public final int f2426a;
    public final ce f2427b;

    public cc(ce ceVar, int i10) {
        this.f2426a = i10;
        this.f2427b = ceVar;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.f10074a;
        ce ceVar = this.f2427b;
        ceVar.Y = i10;
        ceVar.Z = defaultWindowInsets.f10075b;
        ceVar.f2431a0 = defaultWindowInsets.f10076c;
        ceVar.f2434b0 = defaultWindowInsets.d;
        ceVar.f2470n.requestLayout();
        return r0.l1.f41073b;
    }

    @Override
    public void a(float f7) {
        ce ceVar = this.f2427b;
        bd bdVar = ceVar.B0;
        if (bdVar != null) {
            ceVar.T1 = f7;
            bdVar.setZoom(f7);
        }
        ceVar.j0(true);
    }

    @Override
    public void c(c00 c00Var) {
        MediaController.SavedFilterState savedFilterState;
        ce ceVar = this.f2427b;
        if (c00Var != null) {
            r9 r9Var = ceVar.K1;
            if (r9Var != null && (savedFilterState = r9Var.f3561a1) != null) {
                c00Var.f(new d00(savedFilterState));
                return;
            }
            return;
        }
        ceVar.getClass();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f2426a) {
            case 2:
                ce ceVar = this.f2427b;
                ceVar.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    ceVar.f2433b.startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                ce ceVar2 = this.f2427b;
                ceVar2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    ceVar2.f2433b.startActivity(intent2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 4:
            case 6:
            case 7:
            default:
                ce ceVar3 = this.f2427b;
                ceVar3.getClass();
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    ceVar3.f2433b.startActivity(intent3);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 5:
                ce ceVar4 = this.f2427b;
                ceVar4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    ceVar4.f2433b.startActivity(intent4);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 8:
                ce ceVar5 = this.f2427b;
                int i11 = ceVar5.f2437c;
                r9 r9Var = ceVar5.K1;
                if (r9Var != null) {
                    r9Var.D0 = MessagesController.getInstance(i11).storyEntitiesAllowed();
                    ceVar5.V1 = !ceVar5.K1.f3565c;
                    ceVar5.i(null);
                    ceVar5.l();
                    ceVar5.m();
                    ceVar5.y();
                    r9 r9Var2 = ceVar5.K1;
                    r9Var2.i(true);
                    r9Var2.C0 = ceVar5.f2439c1.getText();
                    ceVar5.K1 = null;
                    ceVar5.W(r9Var2, true);
                    f1 f1Var = MessagesController.getInstance(i11).getStoriesController().f48517w;
                    if (r9Var2.f3565c) {
                        f1Var.d(r9Var2);
                    } else {
                        ArrayList arrayList = f1Var.f2684b;
                        if (!r9Var2.f3600u) {
                            f1Var.e(r9Var2);
                            r9Var2.f3562b = Utilities.random.nextLong();
                            e1 e1Var = new e1(r9Var2);
                            arrayList.remove(r9Var2);
                            arrayList.add(0, r9Var2);
                            f1Var.a(e1Var);
                        }
                    }
                    ceVar5.K(0, true);
                    return;
                }
                return;
            case 9:
                ce ceVar6 = this.f2427b;
                r9 r9Var3 = ceVar6.K1;
                if (r9Var3 != null && !r9Var3.f3574g && ((!r9Var3.f3586n || r9Var3.f3600u) && r9Var3.f3565c)) {
                    MessagesController.getInstance(ceVar6.f2437c).getStoriesController().f48517w.b(ceVar6.K1);
                    ceVar6.K1 = null;
                }
                r9 r9Var4 = ceVar6.K1;
                if (r9Var4 != null && (r9Var4.f3588o || r9Var4.f3574g || (r9Var4.f3586n && !r9Var4.f3600u))) {
                    ceVar6.q(true);
                    return;
                } else {
                    ceVar6.K(0, true);
                    return;
                }
        }
    }

    @Override
    public void g(final pb pbVar, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i10, a1.e eVar, final a3.d dVar) {
        switch (this.f2426a) {
            case 10:
                ArrayList arrayList = pbVar.f3416b;
                ce ceVar = this.f2427b;
                if (ceVar.K1 != null) {
                    ceVar.X0.x(5, true);
                    ceVar.K1.E0 = pbVar;
                    int i11 = ceVar.f2437c;
                    int i12 = sb.f3659a;
                    SerializedData serializedData = new SerializedData(true);
                    sb.c(serializedData, pbVar);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    sb.c(serializedData2, pbVar);
                    MessagesController.getInstance(i11).getMainSettings().edit().putString("story_privacy2", Utilities.bytesToHex(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    r9 r9Var = ceVar.K1;
                    r9Var.G0 = z12;
                    r9Var.H0 = z11;
                    r9Var.F0.clear();
                    ceVar.K1.F0.addAll(arrayList);
                    r9 r9Var2 = ceVar.K1;
                    r9Var2.f3583l = true;
                    r9Var2.f3602v0 = inputPeer;
                    ArrayList arrayList2 = ceVar.H1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            r9 r9Var3 = (r9) obj;
                            r9Var3.E0 = pbVar;
                            ArrayList arrayList3 = r9Var3.F0;
                            r9Var3.G0 = z12;
                            r9Var3.H0 = z11;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            r9Var3.f3583l = true;
                            r9Var3.f3602v0 = inputPeer;
                        }
                    }
                    ceVar.i(new zb(ceVar, eVar, 0));
                    return;
                }
                return;
            default:
                int i14 = R.raw.permission_request_camera;
                int i15 = R.string.PermissionNoCameraMicVideo;
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final ce ceVar2 = this.f2427b;
                me0.d(i14, i15, strArr, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        final boolean z14;
                        TLRPC.InputPeer inputPeer2;
                        long clientUserId;
                        final ce ceVar3 = ce.this;
                        int i16 = ceVar3.f2437c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final a3.d dVar2 = dVar;
                        if (!booleanValue) {
                            dVar2.run();
                            return;
                        }
                        bd bdVar = ceVar3.B0;
                        if (bdVar != null && !bdVar.isFrontface()) {
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
                        tL_startLive.privacy_rules.addAll(pbVar.f3416b);
                        tL_startLive.random_id = Utilities.random.nextLong();
                        final boolean z15 = z13;
                        tL_startLive.rtmp_stream = z15;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(i16).sendRequest(tL_startLive, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                AndroidUtilities.runOnUIThread(new gc(ce.this, tLObject, tL_startLive, z15, j3, z14, tL_error, dVar2));
                            }
                        });
                    }
                });
                return;
        }
    }

    @Override
    public Bitmap i(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.f2427b.K1.L.getAbsolutePath(), options);
    }

    @Override
    public void onCameraInit() {
        ce ceVar = this.f2427b;
        String C = ceVar.C();
        String str = null;
        if (TextUtils.equals(C, ceVar.F())) {
            C = null;
        }
        if (ceVar.f2448f0 == 0) {
            str = C;
        }
        ceVar.e0(str);
        q91 q91Var = ceVar.V0;
        if (q91Var != null) {
            ceVar.T1 = 0.0f;
            q91Var.b(0.0f, false);
        }
        ceVar.m0(true);
    }

    @Override
    public Object run() {
        Bitmap bitmap;
        nd ndVar;
        ce ceVar = this.f2427b;
        sf0 sf0Var = ceVar.B1;
        if (sf0Var != null) {
            bitmap = sf0Var.getUiBlurBitmap();
        } else {
            bitmap = null;
        }
        if (bitmap == null && (ndVar = ceVar.X0) != null && ndVar.getTextureView() != null) {
            return ceVar.X0.getTextureView().getUiBlurBitmap();
        }
        return bitmap;
    }
}

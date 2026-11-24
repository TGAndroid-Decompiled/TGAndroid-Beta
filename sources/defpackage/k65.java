package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public final class k65 extends c6 {
    public final LaunchActivity a;
    public final h75 b;

    public k65(h75 h75Var, LaunchActivity launchActivity) {
        this.b = h75Var;
        this.a = launchActivity;
    }

    @Override
    public final void b(int i) {
        VoIPService sharedInstance;
        int i2;
        int w0;
        int i3;
        int i4;
        int i5;
        String str;
        h75 h75Var = this.b;
        a8 a8Var = h75Var.i3;
        if (i == -1) {
            h75Var.onBackPressed();
        } else if (i == 1) {
            h75Var.T2.b.join_muted = false;
            h75Var.C1();
        } else if (i == 2) {
            h75Var.T2.b.join_muted = true;
            h75Var.C1();
        } else if (i == 3) {
            h75Var.a1(false);
        } else if (i == 12) {
            h75Var.v1(true);
        } else if (i == 13) {
            h75Var.v1(false);
        } else if (i == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h75Var.getContext());
            boolean W = hc2.W(h75Var.S2);
            hd hdVar = alertDialog$Builder.a;
            if (W) {
                hdVar.S = k96.M0(2131743240, null);
                hdVar.U = k96.M0(2131743241, null);
            } else {
                hdVar.S = k96.M0(2131743139, null);
                hdVar.U = k96.M0(2131743140, null);
            }
            hdVar.J = bkb.fh;
            alertDialog$Builder.j(k96.M0(2131743141, null), new d65(this));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            hdVar.j(bkb.w0(null, bkb.kh, false));
            hdVar.show();
            TextView textView = (TextView) hdVar.c(-1);
            if (textView != null) {
                zkb.X(textView, bkb.lh, null);
            }
            hdVar.o(bkb.w0(null, bkb.Xg, false));
        } else if (i == 9) {
            h75Var.d3.callOnClick();
        } else if (i == 5) {
            fc2 fc2Var = h75Var.T2;
            if (fc2Var.w) {
                boolean z = fc2Var.b.record_video_active;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(h75Var.getContext());
                int i6 = bkb.fh;
                hd hdVar2 = alertDialog$Builder2.a;
                hdVar2.J = i6;
                hdVar2.S = k96.M0(2131743079, null);
                if (hc2.W(h75Var.S2)) {
                    hdVar2.U = k96.M0(2131743212, null);
                } else {
                    hdVar2.U = k96.M0(2131743080, null);
                }
                alertDialog$Builder2.j(k96.M0(2131744604, null), new l41((byte) 7, this, z));
                alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                hdVar2.j(bkb.w0(null, bkb.kh, false));
                hdVar2.show();
                hdVar2.o(bkb.w0(null, bkb.dh, false));
                return;
            }
            f65 f65Var = new f65(this, h75Var.getContext(), h75Var.S2, h75Var.y4);
            if (h75Var.i1()) {
                f65Var.E0(2);
            } else {
                f65Var.show();
            }
        } else if (i == 7) {
            h75Var.e2 = true;
            h75Var.p3.setVisibility(0);
            h75Var.q3.setVisibility(0);
            h75Var.e3.setVisibility(8);
            h75Var.s3.setVisibility(8);
            h75Var.t3.setVisibility(8);
            h75Var.r3.setVisibility(8);
            h75Var.m3.setVisibility(8);
            h75Var.f3.setVisibility(8);
            h75Var.n3.setVisibility(8);
            h75Var.o3.setVisibility(8);
            h75Var.d2.setVisibility(8);
            h75Var.g3.setVisibility(8);
            h75Var.h3.setVisibility(8);
            a8Var.setVisibility(8);
            r7 r7Var = h75Var.b3;
            m8 m8Var = r7Var.d;
            if (m8Var != null && m8Var.isShowing()) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = r7Var.b;
                Point point = gl.q;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(ug8.f(40.0f, point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                r7Var.W(true, true);
            }
        } else if (i == 6) {
            h75Var.q2 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(h75Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(bkb.T(h75Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(h75Var.getContext());
            int i7 = bkb.fh;
            hd hdVar3 = alertDialog$Builder3.a;
            hdVar3.J = i7;
            if (hc2.W(h75Var.S2)) {
                hdVar3.S = k96.M0(2131743211, null);
            } else {
                hdVar3.S = k96.M0(2131743078, null);
            }
            hdVar3.z0 = false;
            alertDialog$Builder3.g(k96.M0(2131752577, null), new kt3(editTextBoldCursor, (byte) 2));
            LinearLayout linearLayout = new LinearLayout(h75Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.n(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i8 = bkb.dh;
            zkb.X(editTextBoldCursor, i8, null);
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = h75Var.S2;
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            editTextBoldCursor.setHint(str);
            zkb.D(editTextBoldCursor, bkb.eh, null);
            zkb.l(editTextBoldCursor, 30, i8, null);
            editTextBoldCursor.setCursorSize(gl.L(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, gl.L(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, nme.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new gc4(alertDialog$Builder3, (byte) 1));
            editTextBoldCursor.addTextChangedListener(new jc4(editTextBoldCursor, (byte) 1));
            if (!TextUtils.isEmpty(h75Var.T2.b.title)) {
                editTextBoldCursor.setText(h75Var.T2.b.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.j(k96.M0(2131745754, null), new lt2(this, editTextBoldCursor, alertDialog$Builder3, false, (byte) 14));
            hdVar3.j(bkb.w0(null, bkb.Vg, false));
            hdVar3.setOnShowListener(new e65(this, hdVar3, editTextBoldCursor, (byte) 0));
            hdVar3.setOnDismissListener(new ic4(editTextBoldCursor, (byte) 1));
            hdVar3.show();
            hdVar3.o(bkb.w0(null, i8, false));
            editTextBoldCursor.requestFocus();
        } else if (i == 8) {
            xt5.E0(h75Var.getContext(), -h75Var.Z0(), h75Var.n1, null, 2, h75Var.u2, new d65(this));
        } else if (i == 14) {
            na7.c1().edit().putBoolean("asr_live_captions", !q66.a()).apply();
            boolean a = q66.a();
            h75Var.j3.a(a, true);
            if (a) {
                i5 = 2131745057;
            } else {
                i5 = 2131745058;
            }
            a8Var.setSubtext(k96.M0(i5, null));
            h75Var.G1();
        } else if (i == 11) {
            gba.E0 = !gba.E0;
            SharedPreferences.Editor edit = na7.c1().edit();
            edit.putBoolean("noiseSupression", gba.E0);
            edit.apply();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null) {
                sharedInstance2.setNoiseSupressionEnabled(gba.E0);
            }
        } else if (i == 10 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            b00.r(null, 2131743257, arrayList, 2131232435, arrayList2);
            arrayList3.add(0);
            if (sharedInstance.hasEarpiece()) {
                if (sharedInstance.isHeadsetPlugged()) {
                    i3 = 2131743259;
                } else {
                    i3 = 2131743258;
                }
                arrayList.add(k96.M0(i3, null));
                if (sharedInstance.isHeadsetPlugged()) {
                    i4 = 2131232431;
                } else {
                    i4 = 2131232433;
                }
                arrayList2.add(Integer.valueOf(i4));
                arrayList3.add(1);
            }
            if (sharedInstance.isBluetoothHeadsetConnected()) {
                String str2 = sharedInstance.currentBluetoothDeviceName;
                if (str2 == null) {
                    str2 = k96.M0(2131743261, null);
                }
                arrayList.add(str2);
                arrayList2.add(2131232430);
                arrayList3.add(2);
            }
            int size = arrayList.size();
            CharSequence[] charSequenceArr = new CharSequence[size];
            int[] iArr = new int[size];
            for (int i9 = 0; i9 < size; i9++) {
                charSequenceArr[i9] = (CharSequence) arrayList.get(i9);
                iArr[i9] = ((Integer) arrayList2.get(i9)).intValue();
            }
            fx0 fx0Var = new fx0(1, (wjb) null, (Context) this.a, false);
            fx0Var.K();
            fx0Var.P = k96.M0(2131743001, null);
            fx0Var.Q = true;
            fe feVar = new fe((Object) this, arrayList3, (byte) 6);
            fx0Var.M = charSequenceArr;
            fx0Var.N = iArr;
            fx0Var.L = feVar;
            int i10 = bkb.ah;
            fx0Var.s0(bkb.w0(null, i10, false));
            fx0Var.L(bkb.w0(null, i10, false));
            if (sharedInstance.getCurrentAudioRoute() == 1) {
                i2 = 0;
            } else if (sharedInstance.getCurrentAudioRoute() == 0) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            fx0Var.show();
            int w02 = bkb.w0(null, bkb.dh, false);
            xw0 xw0Var = fx0Var.m0;
            if (xw0Var != null) {
                xw0Var.setTextColor(w02);
            }
            int i11 = 0;
            while (true) {
                ArrayList arrayList4 = fx0Var.x0;
                if (i11 < arrayList4.size()) {
                    zw0 zw0Var = (zw0) arrayList4.get(i11);
                    if (i11 == i2) {
                        w0 = bkb.w0(null, bkb.fh, false);
                        zw0Var.f = true;
                    } else {
                        w0 = bkb.w0(null, bkb.dh, false);
                    }
                    zw0Var.setTextColor(w0);
                    zw0Var.setIconColor(w0);
                    int i12 = bkb.Xg;
                    ff0 f0 = bkb.f0(bm2.o(bkb.w0(null, i12, false), 12), 2, -1);
                    vkb g = zkb.g(i12, 12);
                    zw0Var.setBackground(f0);
                    zkb.j(zw0Var, f0, null, g, null);
                    i11++;
                } else {
                    return;
                }
            }
        }
    }
}

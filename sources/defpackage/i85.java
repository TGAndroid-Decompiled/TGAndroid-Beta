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
public final class i85 extends c6 {
    public final LaunchActivity a;
    public final g95 b;

    public i85(g95 g95Var, LaunchActivity launchActivity) {
        this.b = g95Var;
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
        g95 g95Var = this.b;
        a8 a8Var = g95Var.i3;
        if (i == -1) {
            g95Var.onBackPressed();
        } else if (i == 1) {
            g95Var.T2.b.join_muted = false;
            g95Var.C1();
        } else if (i == 2) {
            g95Var.T2.b.join_muted = true;
            g95Var.C1();
        } else if (i == 3) {
            g95Var.a1(false);
        } else if (i == 12) {
            g95Var.v1(true);
        } else if (i == 13) {
            g95Var.v1(false);
        } else if (i == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g95Var.getContext());
            boolean W = sd2.W(g95Var.S2);
            he heVar = alertDialog$Builder.a;
            if (W) {
                heVar.S = jb6.M0(2131743166, null);
                heVar.U = jb6.M0(2131743167, null);
            } else {
                heVar.S = jb6.M0(2131743065, null);
                heVar.U = jb6.M0(2131743066, null);
            }
            heVar.J = cmb.fh;
            alertDialog$Builder.j(jb6.M0(2131743067, null), new b85(this));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            heVar.j(cmb.w0(null, cmb.kh, false));
            heVar.show();
            TextView textView = (TextView) heVar.c(-1);
            if (textView != null) {
                anb.X(textView, cmb.lh, null);
            }
            heVar.o(cmb.w0(null, cmb.Xg, false));
        } else if (i == 9) {
            g95Var.d3.callOnClick();
        } else if (i == 5) {
            qd2 qd2Var = g95Var.T2;
            if (qd2Var.w) {
                boolean z = qd2Var.b.record_video_active;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(g95Var.getContext());
                int i6 = cmb.fh;
                he heVar2 = alertDialog$Builder2.a;
                heVar2.J = i6;
                heVar2.S = jb6.M0(2131743005, null);
                if (sd2.W(g95Var.S2)) {
                    heVar2.U = jb6.M0(2131743138, null);
                } else {
                    heVar2.U = jb6.M0(2131743006, null);
                }
                alertDialog$Builder2.j(jb6.M0(2131744530, null), new s51((byte) 7, this, z));
                alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                heVar2.j(cmb.w0(null, cmb.kh, false));
                heVar2.show();
                heVar2.o(cmb.w0(null, cmb.dh, false));
                return;
            }
            d85 d85Var = new d85(this, g95Var.getContext(), g95Var.S2, g95Var.y4);
            if (g95Var.i1()) {
                d85Var.E0(2);
            } else {
                d85Var.show();
            }
        } else if (i == 7) {
            g95Var.e2 = true;
            g95Var.p3.setVisibility(0);
            g95Var.q3.setVisibility(0);
            g95Var.e3.setVisibility(8);
            g95Var.s3.setVisibility(8);
            g95Var.t3.setVisibility(8);
            g95Var.r3.setVisibility(8);
            g95Var.m3.setVisibility(8);
            g95Var.f3.setVisibility(8);
            g95Var.n3.setVisibility(8);
            g95Var.o3.setVisibility(8);
            g95Var.d2.setVisibility(8);
            g95Var.g3.setVisibility(8);
            g95Var.h3.setVisibility(8);
            a8Var.setVisibility(8);
            r7 r7Var = g95Var.b3;
            m8 m8Var = r7Var.d;
            if (m8Var != null && m8Var.isShowing()) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = r7Var.b;
                Point point = gm.q;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(wi8.f(40.0f, point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                r7Var.W(true, true);
            }
        } else if (i == 6) {
            g95Var.q2 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(g95Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(cmb.T(g95Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(g95Var.getContext());
            int i7 = cmb.fh;
            he heVar3 = alertDialog$Builder3.a;
            heVar3.J = i7;
            if (sd2.W(g95Var.S2)) {
                heVar3.S = jb6.M0(2131743137, null);
            } else {
                heVar3.S = jb6.M0(2131743004, null);
            }
            heVar3.z0 = false;
            alertDialog$Builder3.g(jb6.M0(2131752542, null), new uu3(editTextBoldCursor, (byte) 2));
            LinearLayout linearLayout = new LinearLayout(g95Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.n(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i8 = cmb.dh;
            anb.X(editTextBoldCursor, i8, null);
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = g95Var.S2;
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            editTextBoldCursor.setHint(str);
            anb.D(editTextBoldCursor, cmb.eh, null);
            anb.l(editTextBoldCursor, 30, i8, null);
            editTextBoldCursor.setCursorSize(gm.L(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, gm.L(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, qoe.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new ge4(alertDialog$Builder3, (byte) 1));
            editTextBoldCursor.addTextChangedListener(new je4(editTextBoldCursor, (byte) 1));
            if (!TextUtils.isEmpty(g95Var.T2.b.title)) {
                editTextBoldCursor.setText(g95Var.T2.b.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.j(jb6.M0(2131745680, null), new wu2(this, editTextBoldCursor, alertDialog$Builder3, false, (byte) 14));
            heVar3.j(cmb.w0(null, cmb.Vg, false));
            heVar3.setOnShowListener(new c85(this, heVar3, editTextBoldCursor, (byte) 0));
            heVar3.setOnDismissListener(new ie4(editTextBoldCursor, (byte) 1));
            heVar3.show();
            heVar3.o(cmb.w0(null, i8, false));
            editTextBoldCursor.requestFocus();
        } else if (i == 8) {
            wv5.E0(g95Var.getContext(), -g95Var.Z0(), g95Var.n1, null, 2, g95Var.u2, new b85(this));
        } else if (i == 14) {
            oc7.d1().edit().putBoolean("asr_live_captions", !q86.a()).apply();
            boolean a = q86.a();
            g95Var.j3.a(a, true);
            if (a) {
                i5 = 2131744983;
            } else {
                i5 = 2131744984;
            }
            a8Var.setSubtext(jb6.M0(i5, null));
            g95Var.G1();
        } else if (i == 11) {
            gda.E0 = !gda.E0;
            SharedPreferences.Editor edit = oc7.d1().edit();
            edit.putBoolean("noiseSupression", gda.E0);
            edit.apply();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null) {
                sharedInstance2.setNoiseSupressionEnabled(gda.E0);
            }
        } else if (i == 10 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            b10.r(null, 2131743183, arrayList, 2131232436, arrayList2);
            arrayList3.add(0);
            if (sharedInstance.hasEarpiece()) {
                if (sharedInstance.isHeadsetPlugged()) {
                    i3 = 2131743185;
                } else {
                    i3 = 2131743184;
                }
                arrayList.add(jb6.M0(i3, null));
                if (sharedInstance.isHeadsetPlugged()) {
                    i4 = 2131232432;
                } else {
                    i4 = 2131232434;
                }
                arrayList2.add(Integer.valueOf(i4));
                arrayList3.add(1);
            }
            if (sharedInstance.isBluetoothHeadsetConnected()) {
                String str2 = sharedInstance.currentBluetoothDeviceName;
                if (str2 == null) {
                    str2 = jb6.M0(2131743187, null);
                }
                arrayList.add(str2);
                arrayList2.add(2131232431);
                arrayList3.add(2);
            }
            int size = arrayList.size();
            CharSequence[] charSequenceArr = new CharSequence[size];
            int[] iArr = new int[size];
            for (int i9 = 0; i9 < size; i9++) {
                charSequenceArr[i9] = (CharSequence) arrayList.get(i9);
                iArr[i9] = ((Integer) arrayList2.get(i9)).intValue();
            }
            my0 my0Var = new my0(1, (ylb) null, (Context) this.a, false);
            my0Var.J();
            my0Var.P = jb6.M0(2131742927, null);
            my0Var.Q = true;
            ff ffVar = new ff((Object) this, arrayList3, (byte) 6);
            my0Var.M = charSequenceArr;
            my0Var.N = iArr;
            my0Var.L = ffVar;
            int i10 = cmb.ah;
            my0Var.s0(cmb.w0(null, i10, false));
            my0Var.K(cmb.w0(null, i10, false));
            if (sharedInstance.getCurrentAudioRoute() == 1) {
                i2 = 0;
            } else if (sharedInstance.getCurrentAudioRoute() == 0) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            my0Var.show();
            int w02 = cmb.w0(null, cmb.dh, false);
            ey0 ey0Var = my0Var.m0;
            if (ey0Var != null) {
                ey0Var.setTextColor(w02);
            }
            int i11 = 0;
            while (true) {
                ArrayList arrayList4 = my0Var.x0;
                if (i11 < arrayList4.size()) {
                    gy0 gy0Var = (gy0) arrayList4.get(i11);
                    if (i11 == i2) {
                        w0 = cmb.w0(null, cmb.fh, false);
                        gy0Var.f = true;
                    } else {
                        w0 = cmb.w0(null, cmb.dh, false);
                    }
                    gy0Var.setTextColor(w0);
                    gy0Var.setIconColor(w0);
                    int i12 = cmb.Xg;
                    fg0 f0 = cmb.f0(on2.p(cmb.w0(null, i12, false), 12), 2, -1);
                    wmb g = anb.g(i12, 12);
                    gy0Var.setBackground(f0);
                    anb.j(gy0Var, f0, null, g, null);
                    i11++;
                } else {
                    return;
                }
            }
        }
    }
}

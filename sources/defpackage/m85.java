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
public final class m85 extends d6 {
    public final LaunchActivity a;
    public final j95 b;

    public m85(j95 j95Var, LaunchActivity launchActivity) {
        this.b = j95Var;
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
        j95 j95Var = this.b;
        b8 b8Var = j95Var.i3;
        if (i == -1) {
            j95Var.onBackPressed();
        } else if (i == 1) {
            j95Var.T2.b.join_muted = false;
            j95Var.D1();
        } else if (i == 2) {
            j95Var.T2.b.join_muted = true;
            j95Var.D1();
        } else if (i == 3) {
            j95Var.b1(false);
        } else if (i == 12) {
            j95Var.w1(true);
        } else if (i == 13) {
            j95Var.w1(false);
        } else if (i == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(j95Var.getContext());
            boolean W = xc2.W(j95Var.S2);
            id idVar = alertDialog$Builder.a;
            if (W) {
                idVar.S = ob6.M0(2131743134, null);
                idVar.U = ob6.M0(2131743135, null);
            } else {
                idVar.S = ob6.M0(2131743033, null);
                idVar.U = ob6.M0(2131743034, null);
            }
            idVar.J = aob.gh;
            alertDialog$Builder.j(ob6.M0(2131743035, null), new f85(this));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            idVar.j(aob.w0(null, aob.lh, false));
            idVar.show();
            TextView textView = (TextView) idVar.c(-1);
            if (textView != null) {
                yob.X(textView, aob.mh, null);
            }
            idVar.o(aob.w0(null, aob.Yg, false));
        } else if (i == 9) {
            j95Var.d3.callOnClick();
        } else if (i == 5) {
            vc2 vc2Var = j95Var.T2;
            if (vc2Var.w) {
                boolean z = vc2Var.b.record_video_active;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(j95Var.getContext());
                int i6 = aob.gh;
                id idVar2 = alertDialog$Builder2.a;
                idVar2.J = i6;
                idVar2.S = ob6.M0(2131742973, null);
                if (xc2.W(j95Var.S2)) {
                    idVar2.U = ob6.M0(2131743106, null);
                } else {
                    idVar2.U = ob6.M0(2131742974, null);
                }
                alertDialog$Builder2.j(ob6.M0(2131744498, null), new t41((byte) 7, this, z));
                alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                idVar2.j(aob.w0(null, aob.lh, false));
                idVar2.show();
                idVar2.o(aob.w0(null, aob.eh, false));
                return;
            }
            h85 h85Var = new h85(this, j95Var.getContext(), j95Var.S2, j95Var.y4);
            if (j95Var.j1()) {
                h85Var.F0(2);
            } else {
                h85Var.show();
            }
        } else if (i == 7) {
            j95Var.e2 = true;
            j95Var.p3.setVisibility(0);
            j95Var.q3.setVisibility(0);
            j95Var.e3.setVisibility(8);
            j95Var.s3.setVisibility(8);
            j95Var.t3.setVisibility(8);
            j95Var.r3.setVisibility(8);
            j95Var.m3.setVisibility(8);
            j95Var.f3.setVisibility(8);
            j95Var.n3.setVisibility(8);
            j95Var.o3.setVisibility(8);
            j95Var.d2.setVisibility(8);
            j95Var.g3.setVisibility(8);
            j95Var.h3.setVisibility(8);
            b8Var.setVisibility(8);
            s7 s7Var = j95Var.b3;
            n8 n8Var = s7Var.d;
            if (n8Var != null && n8Var.isShowing()) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = s7Var.b;
                Point point = hl.q;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(ik8.f(40.0f, point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                s7Var.W(true, true);
            }
        } else if (i == 6) {
            j95Var.q2 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(j95Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(aob.T(j95Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(j95Var.getContext());
            int i7 = aob.gh;
            id idVar3 = alertDialog$Builder3.a;
            idVar3.J = i7;
            if (xc2.W(j95Var.S2)) {
                idVar3.S = ob6.M0(2131743105, null);
            } else {
                idVar3.S = ob6.M0(2131742972, null);
            }
            idVar3.z0 = false;
            alertDialog$Builder3.g(ob6.M0(2131752570, null), new bu3(editTextBoldCursor, (byte) 2));
            LinearLayout linearLayout = new LinearLayout(j95Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.n(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i8 = aob.eh;
            yob.X(editTextBoldCursor, i8, null);
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = j95Var.S2;
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            editTextBoldCursor.setHint(str);
            yob.D(editTextBoldCursor, aob.fh, null);
            yob.l(editTextBoldCursor, 30, i8, null);
            editTextBoldCursor.setCursorSize(hl.L(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, hl.L(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, tre.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new de4(alertDialog$Builder3, (byte) 1));
            editTextBoldCursor.addTextChangedListener(new ge4(editTextBoldCursor, (byte) 1));
            if (!TextUtils.isEmpty(j95Var.T2.b.title)) {
                editTextBoldCursor.setText(j95Var.T2.b.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.j(ob6.M0(2131745674, null), new fu2(this, editTextBoldCursor, alertDialog$Builder3, false, (byte) 14));
            idVar3.j(aob.w0(null, aob.Wg, false));
            idVar3.setOnShowListener(new g85(this, idVar3, editTextBoldCursor, (byte) 0));
            idVar3.setOnDismissListener(new fe4(editTextBoldCursor, (byte) 1));
            idVar3.show();
            idVar3.o(aob.w0(null, i8, false));
            editTextBoldCursor.requestFocus();
        } else if (i == 8) {
            bw5.F0(j95Var.getContext(), -j95Var.a1(), j95Var.n1, null, 2, j95Var.u2, new f85(this));
        } else if (i == 14) {
            uc7.e1().edit().putBoolean("asr_live_captions", !u86.a()).apply();
            boolean a = u86.a();
            j95Var.j3.a(a, true);
            if (a) {
                i5 = 2131744964;
            } else {
                i5 = 2131744965;
            }
            b8Var.setSubtext(ob6.M0(i5, null));
            j95Var.H1();
        } else if (i == 11) {
            xea.E0 = !xea.E0;
            SharedPreferences.Editor edit = uc7.e1().edit();
            edit.putBoolean("noiseSupression", xea.E0);
            edit.apply();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null) {
                sharedInstance2.setNoiseSupressionEnabled(xea.E0);
            }
        } else if (i == 10 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            c00.s(null, 2131743151, arrayList, 2131232435, arrayList2);
            arrayList3.add(0);
            if (sharedInstance.hasEarpiece()) {
                if (sharedInstance.isHeadsetPlugged()) {
                    i3 = 2131743153;
                } else {
                    i3 = 2131743152;
                }
                arrayList.add(ob6.M0(i3, null));
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
                    str2 = ob6.M0(2131743155, null);
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
            nx0 nx0Var = new nx0(1, (vnb) null, (Context) this.a, false);
            nx0Var.J();
            nx0Var.P = ob6.M0(2131742895, null);
            nx0Var.Q = true;
            oh ohVar = new oh((Object) this, arrayList3, (byte) 6);
            nx0Var.M = charSequenceArr;
            nx0Var.N = iArr;
            nx0Var.L = ohVar;
            int i10 = aob.bh;
            nx0Var.s0(aob.w0(null, i10, false));
            nx0Var.K(aob.w0(null, i10, false));
            if (sharedInstance.getCurrentAudioRoute() == 1) {
                i2 = 0;
            } else if (sharedInstance.getCurrentAudioRoute() == 0) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            nx0Var.show();
            int w02 = aob.w0(null, aob.eh, false);
            fx0 fx0Var = nx0Var.m0;
            if (fx0Var != null) {
                fx0Var.setTextColor(w02);
            }
            int i11 = 0;
            while (true) {
                ArrayList arrayList4 = nx0Var.x0;
                if (i11 < arrayList4.size()) {
                    hx0 hx0Var = (hx0) arrayList4.get(i11);
                    if (i11 == i2) {
                        w0 = aob.w0(null, aob.gh, false);
                        hx0Var.f = true;
                    } else {
                        w0 = aob.w0(null, aob.eh, false);
                    }
                    hx0Var.setTextColor(w0);
                    hx0Var.setIconColor(w0);
                    int i12 = aob.Yg;
                    hf0 f0 = aob.f0(vm2.o(aob.w0(null, i12, false), 12), 2, -1);
                    uob g = yob.g(i12, 12);
                    hx0Var.setBackground(f0);
                    yob.j(hx0Var, f0, null, g, null);
                    i11++;
                } else {
                    return;
                }
            }
        }
    }
}

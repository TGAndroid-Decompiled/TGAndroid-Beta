package hg;

import ai.e4;
import ai.f5;
import ai.u7;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ci.rc;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ok;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.w51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wn;
import w7.y5;
public final class z1 extends m2 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.a2 h;
    public s61 f10476a;
    public final ArrayList f10477b;
    public NumberTextView f10478c;
    public org.telegram.ui.ActionBar.u0 d;
    public int e;
    public boolean f10479f;

    public z1() {
        super(null);
        this.f10477b = new ArrayList();
        this.f10479f = true;
    }

    public static void U(z1 z1Var, int i10, ArrayList arrayList) {
        if (i10 == z1Var.e) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((w51) arrayList.get(i11)).G instanceof b2) {
                    ((b2) ((w51) arrayList.get(i11)).G).f10207c = i11;
                }
            }
            c2 f7 = c2.f(z1Var.currentAccount);
            ArrayList arrayList2 = f7.f10225b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = com.google.android.gms.internal.vision.e2.e(((b2) arrayList2.get(i12)).f10205a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new a4.e(16));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((b2) arrayList2.get(i13)).f10205a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = com.google.android.gms.internal.vision.e2.e(((b2) arrayList2.get(i14)).f10205a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f7.f10224a).sendRequest(tL_messages_reorderQuickReplies, new u7(5));
                    f7.l();
                    return;
                }
            }
        }
    }

    public static void V(z1 z1Var, ArrayList arrayList, k61 k61Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        w51 w51Var = new w51(2);
        w51Var.f29895l = string;
        w51Var.f29898o = string2;
        w51Var.f29896m = "RestrictedEmoji";
        w51Var.f29897n = "📝";
        arrayList.add(w51Var);
        k61Var.U();
        c2 f7 = c2.f(z1Var.currentAccount);
        ArrayList arrayList2 = f7.f10225b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            if (i11 == 0 && !"hello".equalsIgnoreCase(((b2) arrayList2.get(i13)).f10206b)) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            if (i12 == 0 && !"away".equalsIgnoreCase(((b2) arrayList2.get(i13)).f10206b)) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            if (i11 != 0 && i12 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i11 ^ 1) + (i12 ^ 1) < MessagesController.getInstance(f7.f10224a).quickRepliesLimit) {
            w51 c10 = w51.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c10.f29900q = true;
            arrayList.add(c10);
        }
        z1Var.e = k61Var.M();
        ArrayList arrayList3 = c2.f(z1Var.currentAccount).f10225b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            b2 b2Var = (b2) obj;
            w51 w51Var2 = new w51(16);
            w51Var2.G = b2Var;
            w51Var2.K(z1Var.f10477b.contains(Integer.valueOf(b2Var.f10205a)));
            arrayList.add(w51Var2);
        }
        k61Var.L();
        k61Var.T();
        c.n(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void W(z1 z1Var, w51 w51Var, View view) {
        if (w51Var.d == 1) {
            d0(z1Var.getParentActivity(), z1Var.currentAccount, null, null, z1Var.getResourceProvider(), new ai.y1(z1Var, 26));
        } else if (w51Var.f15715a == 16 && (w51Var.G instanceof b2)) {
            if (!z1Var.f10477b.isEmpty()) {
                z1Var.e0(w51Var, view);
                return;
            }
            b2 b2Var = (b2) w51Var.G;
            if (!b2Var.f10209g) {
                Bundle g10 = org.telegram.ui.Cells.c1.g(5, "chatMode");
                g10.putLong("user_id", z1Var.getUserConfig().getClientUserId());
                g10.putString("quick_reply", b2Var.f10206b);
                wn wnVar = new wn(g10);
                wnVar.nb(b2Var.f10205a);
                z1Var.presentFragment(wnVar);
            }
        }
    }

    public static void X(z1 z1Var) {
        z1Var.f10477b.clear();
        AndroidUtilities.forEachViews((RecyclerView) z1Var.f10476a, (Utilities.Callback<View>) new ai.i(4));
        z1Var.actionBar.r();
        z1Var.f10476a.w1(false);
    }

    public static int c0(z1 z1Var) {
        return z1Var.currentAccount;
    }

    public static void d0(Activity activity, int i10, String str, b2 b2Var, d6 d6Var, Utilities.Callback callback) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        int i11;
        CharSequence charSequence;
        int i12;
        ?? r32;
        m2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        if (R != null && (R.getFragmentView() instanceof bw0) && ((bw0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, d6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, d6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        if (b2Var == null && str == null) {
            i11 = R.string.BusinessRepliesNewTitle;
        } else {
            i11 = R.string.BusinessRepliesEditTitle;
        }
        String string = LocaleController.getString(i11);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder2.f18661a;
        a2Var.R = string;
        final s1 s1Var = new s1(activity, d6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        s1Var.setTextSize(1, 18.0f);
        if (b2Var == null) {
            if (str == null) {
                charSequence = "";
            } else {
                charSequence = str;
            }
        } else {
            charSequence = b2Var.f10206b;
        }
        s1Var.setText(charSequence);
        int i13 = h6.f19165j5;
        s1Var.setTextColor(h6.v0(i13, d6Var));
        s1Var.setHintColor(h6.v0(h6.Xh, d6Var));
        s1Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        s1Var.setSingleLine(true);
        s1Var.setFocusable(true);
        s1Var.setLineColors(h6.v0(h6.f19186k6, d6Var), h6.v0(h6.f19204l6, d6Var), h6.v0(h6.f19279p7, d6Var));
        s1Var.setImeOptions(6);
        s1Var.setBackgroundDrawable(null);
        s1Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        s1Var.setFilters(new InputFilter[]{new Object()});
        LinearLayout e = org.telegram.messenger.f0.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        ok.n(i13, d6Var, textView, 1, 16.0f);
        if (b2Var == null && str == null) {
            i12 = R.string.BusinessRepliesNewMessage;
        } else {
            i12 = R.string.BusinessRepliesEditMessage;
        }
        textView.setText(LocaleController.getString(i12));
        frameLayout.addView(textView, y5.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        ok.n(h6.f19298q7, d6Var, textView2, 1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, y5.e(-1, -2, 83));
        e4 e4Var = new e4(r15, new ValueAnimator[1], textView2, textView, 3);
        Runnable[] runnableArr = {new rc(e4Var, 24)};
        s1Var.addTextChangedListener(new u1(textView2, runnableArr));
        e.addView(frameLayout, y5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e.addView(s1Var, y5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(e);
        a2Var.f18670a = AndroidUtilities.dp(292.0f);
        s1Var.setOnEditorActionListener(new v1(s1Var, i10, b2Var, textView2, e4Var, callback, a2VarArr, view));
        alertDialog$Builder2.k(LocaleController.getString(R.string.Done), new o1(s1Var, e4Var, i10, b2Var, textView2, callback));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new r(1));
        if (z10) {
            h = a2Var;
            a2VarArr[0] = a2Var;
            a2Var.setOnDismissListener(new s(1, view));
            r32 = 0;
            h.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            s1 s1Var2 = s1Var;
                            s1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(s1Var2);
                            return;
                        default:
                            s1 s1Var3 = s1Var;
                            s1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(s1Var3);
                            return;
                    }
                }
            });
            h.q(250L);
        } else {
            r32 = 0;
            a2Var.O = new ai.y1(s1Var, 27);
            a2VarArr[0] = a2Var;
            a2Var.setOnDismissListener(new f5(s1Var, 3));
            a2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            s1 s1Var2 = s1Var;
                            s1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(s1Var2);
                            return;
                        default:
                            s1 s1Var3 = s1Var;
                            s1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(s1Var3);
                            return;
                    }
                }
            });
            a2VarArr[0].show();
        }
        a2VarArr[r32].f18683h0 = r32;
        s1Var.setSelection(s1Var.getText().length());
    }

    @Override
    public final View createView(Context context) {
        c.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new q1(this));
        org.telegram.ui.ActionBar.y j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(getParentActivity());
        this.f10478c = numberTextView;
        numberTextView.setTextSize(18);
        this.f10478c.setTypeface(AndroidUtilities.bold());
        this.f10478c.setTextColor(h6.w0(null, h6.f19444y8, false));
        j3.addView(this.f10478c, y5.m(1.0f, 0, -1, 72, 0, 0));
        this.f10478c.setOnTouchListener(new bi.d(2));
        org.telegram.ui.ActionBar.u0 a2 = j3.a(1, R.drawable.msg_edit);
        this.d = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        j3.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        r1 r1Var = new r1(context, null, 0);
        r1Var.setBackgroundColor(h6.w0(null, h6.f19003a7, false));
        s61 s61Var = new s61(this, new Utilities.Callback2(this) {
            public final z1 f10344b;

            {
                this.f10344b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        z1.V(this.f10344b, (ArrayList) obj, (k61) obj2);
                        return;
                    default:
                        z1.U(this.f10344b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, new n1(this), new n1(this));
        this.f10476a = s61Var;
        s61Var.p1();
        s61 s61Var2 = this.f10476a;
        s61Var2.Y2.f25644r = false;
        s61Var2.B1(new Utilities.Callback2(this) {
            public final z1 f10344b;

            {
                this.f10344b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        z1.V(this.f10344b, (ArrayList) obj, (k61) obj2);
                        return;
                    default:
                        z1.U(this.f10344b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, false);
        r1Var.addView(this.f10476a, y5.c(-1.0f, -1));
        this.actionBar.z(this.f10476a, true);
        this.fragmentView = r1Var;
        return r1Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        s61 s61Var;
        k61 k61Var;
        if (i10 == NotificationCenter.quickRepliesUpdated && (s61Var = this.f10476a) != null && (k61Var = s61Var.Y2) != null) {
            k61Var.N(true);
        }
    }

    public final void e0(w51 w51Var, View view) {
        boolean z10;
        float f7;
        float f10;
        b2 b2Var = (b2) w51Var.G;
        y1 y1Var = (y1) view;
        Integer valueOf = Integer.valueOf(b2Var.f10205a);
        ArrayList arrayList = this.f10477b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(b2Var.f10205a));
        } else {
            arrayList.add(Integer.valueOf(b2Var.f10205a));
        }
        boolean z11 = true;
        this.f10476a.w1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(b2Var.f10205a));
        w51Var.e = contains;
        y1Var.d.a(contains, true);
        if (this.actionBar.s() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.actionBar.r();
            } else {
                this.actionBar.O(null, null);
            }
        }
        this.f10478c.a(Math.max(1, arrayList.size()), true);
        if (arrayList.size() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            b2 c10 = c2.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            z10 = (c10 == null || c2.g(c10.f10206b)) ? false : false;
        }
        if (this.f10479f != z10) {
            this.f10479f = z10;
            ViewPropertyAnimator animate = this.d.animate();
            float f11 = 1.0f;
            if (this.f10479f) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
            if (this.f10479f) {
                f10 = 1.0f;
            } else {
                f10 = 0.7f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (!this.f10479f) {
                f11 = 0.7f;
            }
            ok.s(scaleX.scaleY(f11), sr.h, 340L);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        c2.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f10476a.setPadding(0, 0, 0, i13);
        this.f10476a.setClipToPadding(false);
    }
}

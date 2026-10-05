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
import ci.qc;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yn;
import w7.z5;
public final class y1 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.b2 h;
    public e71 f11407a;
    public final ArrayList f11408b;
    public NumberTextView f11409c;
    public org.telegram.ui.ActionBar.v0 d;
    public int f11410e;
    public boolean f11411f;

    public y1() {
        super(null);
        this.f11408b = new ArrayList();
        this.f11411f = true;
    }

    public static void S(y1 y1Var, int i10, ArrayList arrayList) {
        if (i10 == y1Var.f11410e) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((h61) arrayList.get(i11)).G instanceof a2) {
                    ((a2) ((h61) arrayList.get(i11)).G).f11106c = i11;
                }
            }
            b2 f7 = b2.f(y1Var.currentAccount);
            ArrayList arrayList2 = f7.f11130b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = com.google.android.gms.internal.vision.e2.e(((a2) arrayList2.get(i12)).f11104a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new a4.e(16));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((a2) arrayList2.get(i13)).f11104a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = com.google.android.gms.internal.vision.e2.e(((a2) arrayList2.get(i14)).f11104a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f7.f11129a).sendRequest(tL_messages_reorderQuickReplies, new u7(5));
                    f7.l();
                    return;
                }
            }
        }
    }

    public static void T(y1 y1Var, ArrayList arrayList, w61 w61Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        h61 h61Var = new h61(2);
        h61Var.f27093l = string;
        h61Var.f27096o = string2;
        h61Var.f27094m = "RestrictedEmoji";
        h61Var.f27095n = "📝";
        arrayList.add(h61Var);
        w61Var.U();
        b2 f7 = b2.f(y1Var.currentAccount);
        ArrayList arrayList2 = f7.f11130b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            if (i11 == 0 && !"hello".equalsIgnoreCase(((a2) arrayList2.get(i13)).f11105b)) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            if (i12 == 0 && !"away".equalsIgnoreCase(((a2) arrayList2.get(i13)).f11105b)) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            if (i11 != 0 && i12 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i11 ^ 1) + (i12 ^ 1) < MessagesController.getInstance(f7.f11129a).quickRepliesLimit) {
            h61 c10 = h61.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c10.f27098q = true;
            arrayList.add(c10);
        }
        y1Var.f11410e = w61Var.M();
        ArrayList arrayList3 = b2.f(y1Var.currentAccount).f11130b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            a2 a2Var = (a2) obj;
            h61 h61Var2 = new h61(16);
            h61Var2.G = a2Var;
            h61Var2.L(y1Var.f11408b.contains(Integer.valueOf(a2Var.f11104a)));
            arrayList.add(h61Var2);
        }
        w61Var.L();
        w61Var.T();
        c.n(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void U(y1 y1Var, h61 h61Var, View view) {
        if (h61Var.d == 1) {
            d0(y1Var.getParentActivity(), y1Var.currentAccount, null, null, y1Var.getResourceProvider(), new ai.y1(y1Var, 26));
        } else if (h61Var.f17192a == 16 && (h61Var.G instanceof a2)) {
            if (!y1Var.f11408b.isEmpty()) {
                y1Var.e0(h61Var, view);
                return;
            }
            a2 a2Var = (a2) h61Var.G;
            if (!a2Var.f11109g) {
                Bundle h10 = org.telegram.ui.Cells.c1.h(5, "chatMode");
                h10.putLong("user_id", y1Var.getUserConfig().getClientUserId());
                h10.putString("quick_reply", a2Var.f11105b);
                yn ynVar = new yn(h10);
                ynVar.mb(a2Var.f11104a);
                y1Var.presentFragment(ynVar);
            }
        }
    }

    public static void W(y1 y1Var) {
        y1Var.f11408b.clear();
        AndroidUtilities.forEachViews((RecyclerView) y1Var.f11407a, (Utilities.Callback<View>) new ai.i(4));
        y1Var.actionBar.r();
        y1Var.f11407a.x1(false);
    }

    public static int c0(y1 y1Var) {
        return y1Var.currentAccount;
    }

    public static void d0(Activity activity, int i10, String str, a2 a2Var, d6 d6Var, Utilities.Callback callback) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        int i11;
        CharSequence charSequence;
        int i12;
        ?? r32;
        n2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        if (R != null && (R.getFragmentView() instanceof mw0) && ((mw0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, d6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, d6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        if (a2Var == null && str == null) {
            i11 = R.string.BusinessRepliesNewTitle;
        } else {
            i11 = R.string.BusinessRepliesEditTitle;
        }
        String string = LocaleController.getString(i11);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.f20377a;
        b2Var.R = string;
        final r1 r1Var = new r1(activity, d6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        r1Var.setTextSize(1, 18.0f);
        if (a2Var == null) {
            if (str == null) {
                charSequence = "";
            } else {
                charSequence = str;
            }
        } else {
            charSequence = a2Var.f11105b;
        }
        r1Var.setText(charSequence);
        int i13 = i6.f20935j5;
        r1Var.setTextColor(i6.v0(i13, d6Var));
        r1Var.setHintColor(i6.v0(i6.Xh, d6Var));
        r1Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        r1Var.setSingleLine(true);
        r1Var.setFocusable(true);
        r1Var.setLineColors(i6.v0(i6.f20956k6, d6Var), i6.v0(i6.f20974l6, d6Var), i6.v0(i6.f21049p7, d6Var));
        r1Var.setImeOptions(6);
        r1Var.setBackgroundDrawable(null);
        r1Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        r1Var.setFilters(new InputFilter[]{new Object()});
        LinearLayout e7 = org.telegram.messenger.q.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        bi.m(i13, d6Var, textView, 1, 16.0f);
        if (a2Var == null && str == null) {
            i12 = R.string.BusinessRepliesNewMessage;
        } else {
            i12 = R.string.BusinessRepliesEditMessage;
        }
        textView.setText(LocaleController.getString(i12));
        frameLayout.addView(textView, z5.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        bi.m(i6.f21068q7, d6Var, textView2, 1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, z5.e(-1, -2, 83));
        e4 e4Var = new e4(r15, new ValueAnimator[1], textView2, textView, 3);
        Runnable[] runnableArr = {new qc(e4Var, 24)};
        r1Var.addTextChangedListener(new t1(textView2, runnableArr));
        e7.addView(frameLayout, z5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e7.addView(r1Var, z5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(e7);
        b2Var.f20419a = AndroidUtilities.dp(292.0f);
        r1Var.setOnEditorActionListener(new u1(r1Var, i10, a2Var, textView2, e4Var, callback, b2VarArr, view));
        alertDialog$Builder2.k(LocaleController.getString(R.string.Done), new n1(r1Var, e4Var, i10, a2Var, textView2, callback));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new ga.a(2));
        if (z10) {
            h = b2Var;
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new r(1, view));
            r32 = 0;
            h.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            r1 r1Var2 = r1Var;
                            r1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(r1Var2);
                            return;
                        default:
                            r1 r1Var3 = r1Var;
                            r1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(r1Var3);
                            return;
                    }
                }
            });
            h.q(250L);
        } else {
            r32 = 0;
            b2Var.O = new ai.y1(r1Var, 27);
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new f5(r1Var, 3));
            b2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            r1 r1Var2 = r1Var;
                            r1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(r1Var2);
                            return;
                        default:
                            r1 r1Var3 = r1Var;
                            r1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(r1Var3);
                            return;
                    }
                }
            });
            b2VarArr[0].show();
        }
        b2VarArr[r32].f20433h0 = r32;
        r1Var.setSelection(r1Var.getText().length());
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        c.u(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new p1(this));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(getParentActivity());
        this.f11409c = numberTextView;
        numberTextView.setTextSize(18);
        this.f11409c.setTypeface(AndroidUtilities.bold());
        this.f11409c.setTextColor(i6.w0(null, i6.f21216y8, false));
        j3.addView(this.f11409c, z5.m(1.0f, 0, -1, 72, 0, 0));
        this.f11409c.setOnTouchListener(new bi.d(2));
        org.telegram.ui.ActionBar.v0 a2 = j3.a(1, R.drawable.msg_edit);
        this.d = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        j3.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        q1 q1Var = new q1(context, null, 0);
        e71 e71Var = new e71(this, new Utilities.Callback2(this) {
            public final y1 f11260b;

            {
                this.f11260b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        y1.T(this.f11260b, (ArrayList) obj, (w61) obj2);
                        return;
                    default:
                        y1.S(this.f11260b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, new m1(this), new m1(this));
        this.f11407a = e71Var;
        e71Var.r1();
        this.f11407a.setSectionsDrawBackground(true);
        e71 e71Var2 = this.f11407a;
        e71Var2.f26034f3.f32531r = false;
        e71Var2.C1(new Utilities.Callback2(this) {
            public final y1 f11260b;

            {
                this.f11260b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        y1.T(this.f11260b, (ArrayList) obj, (w61) obj2);
                        return;
                    default:
                        y1.S(this.f11260b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, false);
        q1Var.addView(this.f11407a, z5.c(-1.0f, -1));
        this.fragmentView = q1Var;
        return q1Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e71 e71Var;
        w61 w61Var;
        if (i10 == NotificationCenter.quickRepliesUpdated && (e71Var = this.f11407a) != null && (w61Var = e71Var.f26034f3) != null) {
            w61Var.N(true);
        }
    }

    public final void e0(h61 h61Var, View view) {
        boolean z10;
        float f7;
        float f10;
        a2 a2Var = (a2) h61Var.G;
        x1 x1Var = (x1) view;
        Integer valueOf = Integer.valueOf(a2Var.f11104a);
        ArrayList arrayList = this.f11408b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(a2Var.f11104a));
        } else {
            arrayList.add(Integer.valueOf(a2Var.f11104a));
        }
        boolean z11 = true;
        this.f11407a.x1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(a2Var.f11104a));
        h61Var.f27087e = contains;
        x1Var.d.a(contains, true);
        if (this.actionBar.s() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.actionBar.r();
            } else {
                this.actionBar.L(null, null);
            }
        }
        this.f11409c.a(Math.max(1, arrayList.size()), true);
        if (arrayList.size() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            a2 c10 = b2.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            z10 = (c10 == null || b2.g(c10.f11105b)) ? false : false;
        }
        if (this.f11411f != z10) {
            this.f11411f = z10;
            ViewPropertyAnimator animate = this.d.animate();
            float f11 = 1.0f;
            if (this.f11411f) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
            if (this.f11411f) {
                f10 = 1.0f;
            } else {
                f10 = 0.7f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (!this.f11411f) {
                f11 = 0.7f;
            }
            bi.r(scaleX.scaleY(f11), tr.h, 340L);
        }
    }

    @Override
    public final zl0 getListViewForSimpleGlass() {
        return this.f11407a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        b2.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        super.onFragmentDestroy();
    }
}

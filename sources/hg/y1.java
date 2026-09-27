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
import org.telegram.messenger.qk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;
import w7.y5;
public final class y1 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.c2 h;
    public t61 f10476a;
    public final ArrayList f10477b;
    public NumberTextView f10478c;
    public org.telegram.ui.ActionBar.w0 d;
    public int e;
    public boolean f10479f;

    public y1() {
        super(null);
        this.f10477b = new ArrayList();
        this.f10479f = true;
    }

    public static void U(y1 y1Var, int i10, ArrayList arrayList) {
        if (i10 == y1Var.e) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((x51) arrayList.get(i11)).G instanceof a2) {
                    ((a2) ((x51) arrayList.get(i11)).G).f10212c = i11;
                }
            }
            b2 f7 = b2.f(y1Var.currentAccount);
            ArrayList arrayList2 = f7.f10223b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = com.google.android.gms.internal.vision.e2.e(((a2) arrayList2.get(i12)).f10210a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new a4.e(16));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((a2) arrayList2.get(i13)).f10210a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = com.google.android.gms.internal.vision.e2.e(((a2) arrayList2.get(i14)).f10210a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f7.f10222a).sendRequest(tL_messages_reorderQuickReplies, new u7(5));
                    f7.l();
                    return;
                }
            }
        }
    }

    public static void V(y1 y1Var, ArrayList arrayList, l61 l61Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        x51 x51Var = new x51(2);
        x51Var.f30302l = string;
        x51Var.f30305o = string2;
        x51Var.f30303m = "RestrictedEmoji";
        x51Var.f30304n = "📝";
        arrayList.add(x51Var);
        l61Var.U();
        b2 f7 = b2.f(y1Var.currentAccount);
        ArrayList arrayList2 = f7.f10223b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            if (i11 == 0 && !"hello".equalsIgnoreCase(((a2) arrayList2.get(i13)).f10211b)) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            if (i12 == 0 && !"away".equalsIgnoreCase(((a2) arrayList2.get(i13)).f10211b)) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            if (i11 != 0 && i12 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i11 ^ 1) + (i12 ^ 1) < MessagesController.getInstance(f7.f10222a).quickRepliesLimit) {
            x51 c10 = x51.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c10.f30307q = true;
            arrayList.add(c10);
        }
        y1Var.e = l61Var.M();
        ArrayList arrayList3 = b2.f(y1Var.currentAccount).f10223b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            a2 a2Var = (a2) obj;
            x51 x51Var2 = new x51(16);
            x51Var2.G = a2Var;
            x51Var2.K(y1Var.f10477b.contains(Integer.valueOf(a2Var.f10210a)));
            arrayList.add(x51Var2);
        }
        l61Var.L();
        l61Var.T();
        com.google.android.gms.internal.vision.e2.w(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void W(y1 y1Var, x51 x51Var, View view) {
        if (x51Var.d == 1) {
            d0(y1Var.getParentActivity(), y1Var.currentAccount, null, null, y1Var.getResourceProvider(), new ai.y1(y1Var, 26));
        } else if (x51Var.f15754a == 16 && (x51Var.G instanceof a2)) {
            if (!y1Var.f10477b.isEmpty()) {
                y1Var.e0(x51Var, view);
                return;
            }
            a2 a2Var = (a2) x51Var.G;
            if (!a2Var.f10214g) {
                Bundle g10 = org.telegram.ui.Cells.c1.g(5, "chatMode");
                g10.putLong("user_id", y1Var.getUserConfig().getClientUserId());
                g10.putString("quick_reply", a2Var.f10211b);
                xn xnVar = new xn(g10);
                xnVar.nb(a2Var.f10210a);
                y1Var.presentFragment(xnVar);
            }
        }
    }

    public static void X(y1 y1Var) {
        y1Var.f10477b.clear();
        AndroidUtilities.forEachViews((RecyclerView) y1Var.f10476a, (Utilities.Callback<View>) new ai.i(4));
        y1Var.actionBar.s();
        y1Var.f10476a.x1(false);
    }

    public static int c0(y1 y1Var) {
        return y1Var.currentAccount;
    }

    public static void d0(Activity activity, int i10, String str, a2 a2Var, e6 e6Var, Utilities.Callback callback) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        int i11;
        CharSequence charSequence;
        int i12;
        ?? r32;
        o2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        if (R != null && (R.getFragmentView() instanceof cw0) && ((cw0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, e6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, e6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        if (a2Var == null && str == null) {
            i11 = R.string.BusinessRepliesNewTitle;
        } else {
            i11 = R.string.BusinessRepliesEditTitle;
        }
        String string = LocaleController.getString(i11);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder2.f18655a;
        c2Var.R = string;
        final r1 r1Var = new r1(activity, e6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        r1Var.setTextSize(1, 18.0f);
        if (a2Var == null) {
            if (str == null) {
                charSequence = "";
            } else {
                charSequence = str;
            }
        } else {
            charSequence = a2Var.f10211b;
        }
        r1Var.setText(charSequence);
        int i13 = i6.f19164j5;
        r1Var.setTextColor(i6.v0(i13, e6Var));
        r1Var.setHintColor(i6.v0(i6.Xh, e6Var));
        r1Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        r1Var.setSingleLine(true);
        r1Var.setFocusable(true);
        r1Var.setLineColors(i6.v0(i6.f19185k6, e6Var), i6.v0(i6.f19203l6, e6Var), i6.v0(i6.f19278p7, e6Var));
        r1Var.setImeOptions(6);
        r1Var.setBackgroundDrawable(null);
        r1Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        r1Var.setFilters(new InputFilter[]{new Object()});
        LinearLayout e = org.telegram.messenger.l0.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        qk.n(i13, e6Var, textView, 1, 16.0f);
        if (a2Var == null && str == null) {
            i12 = R.string.BusinessRepliesNewMessage;
        } else {
            i12 = R.string.BusinessRepliesEditMessage;
        }
        textView.setText(LocaleController.getString(i12));
        frameLayout.addView(textView, y5.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        qk.n(i6.f19297q7, e6Var, textView2, 1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, y5.e(-1, -2, 83));
        e4 e4Var = new e4(r15, new ValueAnimator[1], textView2, textView, 3);
        Runnable[] runnableArr = {new qc(e4Var, 24)};
        r1Var.addTextChangedListener(new t1(textView2, runnableArr));
        e.addView(frameLayout, y5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e.addView(r1Var, y5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(e);
        c2Var.f18717a = AndroidUtilities.dp(292.0f);
        r1Var.setOnEditorActionListener(new u1(r1Var, i10, a2Var, textView2, e4Var, callback, c2VarArr, view));
        alertDialog$Builder2.k(LocaleController.getString(R.string.Done), new n1(r1Var, e4Var, i10, a2Var, textView2, callback));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new ga.a(2));
        if (z10) {
            h = c2Var;
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new q(1, view));
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
            c2Var.O = new ai.y1(r1Var, 27);
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new f5(r1Var, 3));
            c2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
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
            c2VarArr[0].show();
        }
        c2VarArr[r32].f18730h0 = r32;
        r1Var.setSelection(r1Var.getText().length());
    }

    @Override
    public final View createView(Context context) {
        k0.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new p1(this));
        org.telegram.ui.ActionBar.a0 k10 = this.actionBar.k(null);
        NumberTextView numberTextView = new NumberTextView(getParentActivity());
        this.f10478c = numberTextView;
        numberTextView.setTextSize(18);
        this.f10478c.setTypeface(AndroidUtilities.bold());
        this.f10478c.setTextColor(i6.w0(null, i6.f19444y8, false));
        k10.addView(this.f10478c, y5.m(1.0f, 0, -1, 72, 0, 0));
        this.f10478c.setOnTouchListener(new bi.d(2));
        org.telegram.ui.ActionBar.w0 a2 = k10.a(1, R.drawable.msg_edit);
        this.d = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        k10.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        q1 q1Var = new q1(context, null, 0);
        q1Var.setBackgroundColor(i6.w0(null, i6.f19001a7, false));
        t61 t61Var = new t61(this, new Utilities.Callback2(this) {
            public final y1 f10341b;

            {
                this.f10341b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        y1.V(this.f10341b, (ArrayList) obj, (l61) obj2);
                        return;
                    default:
                        y1.U(this.f10341b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, new m1(this), new m1(this));
        this.f10476a = t61Var;
        t61Var.q1();
        t61 t61Var2 = this.f10476a;
        t61Var2.Y2.f25959r = false;
        t61Var2.C1(new Utilities.Callback2(this) {
            public final y1 f10341b;

            {
                this.f10341b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        y1.V(this.f10341b, (ArrayList) obj, (l61) obj2);
                        return;
                    default:
                        y1.U(this.f10341b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, false);
        q1Var.addView(this.f10476a, y5.c(-1.0f, -1));
        this.actionBar.A(this.f10476a, true);
        this.fragmentView = q1Var;
        return q1Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        t61 t61Var;
        l61 l61Var;
        if (i10 == NotificationCenter.quickRepliesUpdated && (t61Var = this.f10476a) != null && (l61Var = t61Var.Y2) != null) {
            l61Var.N(true);
        }
    }

    public final void e0(x51 x51Var, View view) {
        boolean z10;
        float f7;
        float f10;
        a2 a2Var = (a2) x51Var.G;
        x1 x1Var = (x1) view;
        Integer valueOf = Integer.valueOf(a2Var.f10210a);
        ArrayList arrayList = this.f10477b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(a2Var.f10210a));
        } else {
            arrayList.add(Integer.valueOf(a2Var.f10210a));
        }
        boolean z11 = true;
        this.f10476a.x1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(a2Var.f10210a));
        x51Var.e = contains;
        x1Var.d.a(contains, true);
        if (this.actionBar.t() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.actionBar.s();
            } else {
                this.actionBar.P(null, null);
            }
        }
        this.f10478c.a(Math.max(1, arrayList.size()), true);
        if (arrayList.size() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            a2 c10 = b2.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            z10 = (c10 == null || b2.g(c10.f10211b)) ? false : false;
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
            qk.s(scaleX.scaleY(f11), sr.h, 340L);
        }
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

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f10476a.setPadding(0, 0, 0, i13);
        this.f10476a.setClipToPadding(false);
    }
}

package hg;

import ai.f4;
import ai.g5;
import ai.v7;
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
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;
import w7.x5;
public final class z1 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.b2 h;
    public l71 f11466a;
    public final ArrayList f11467b;
    public NumberTextView f11468c;
    public org.telegram.ui.ActionBar.v0 d;
    public int f11469e;
    public boolean f11470f;

    public z1() {
        super(null);
        this.f11467b = new ArrayList();
        this.f11470f = true;
    }

    public static void U(z1 z1Var, int i10, ArrayList arrayList) {
        if (i10 == z1Var.f11469e) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((q61) arrayList.get(i11)).G instanceof b2) {
                    ((b2) ((q61) arrayList.get(i11)).G).f11176c = i11;
                }
            }
            c2 f7 = c2.f(z1Var.currentAccount);
            ArrayList arrayList2 = f7.f11183b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = com.google.android.gms.internal.vision.e2.e(((b2) arrayList2.get(i12)).f11174a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new a4.d(16));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((b2) arrayList2.get(i13)).f11174a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = com.google.android.gms.internal.vision.e2.e(((b2) arrayList2.get(i14)).f11174a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f7.f11182a).sendRequest(tL_messages_reorderQuickReplies, new v7(5));
                    f7.l();
                    return;
                }
            }
        }
    }

    public static void V(z1 z1Var, ArrayList arrayList, d71 d71Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        q61 q61Var = new q61(2);
        q61Var.f30063l = string;
        q61Var.f30066o = string2;
        q61Var.f30064m = "RestrictedEmoji";
        q61Var.f30065n = "📝";
        arrayList.add(q61Var);
        d71Var.U();
        c2 f7 = c2.f(z1Var.currentAccount);
        ArrayList arrayList2 = f7.f11183b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            if (i11 == 0 && !"hello".equalsIgnoreCase(((b2) arrayList2.get(i13)).f11175b)) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            if (i12 == 0 && !"away".equalsIgnoreCase(((b2) arrayList2.get(i13)).f11175b)) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            if (i11 != 0 && i12 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i11 ^ 1) + (i12 ^ 1) < MessagesController.getInstance(f7.f11182a).quickRepliesLimit) {
            q61 c10 = q61.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c10.f30068q = true;
            arrayList.add(c10);
        }
        z1Var.f11469e = d71Var.M();
        ArrayList arrayList3 = c2.f(z1Var.currentAccount).f11183b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            b2 b2Var = (b2) obj;
            q61 q61Var2 = new q61(16);
            q61Var2.G = b2Var;
            q61Var2.K(z1Var.f11467b.contains(Integer.valueOf(b2Var.f11174a)));
            arrayList.add(q61Var2);
        }
        d71Var.L();
        d71Var.T();
        c.n(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void W(z1 z1Var, q61 q61Var, View view) {
        if (q61Var.d == 1) {
            d0(z1Var.getParentActivity(), z1Var.currentAccount, null, null, z1Var.getResourceProvider(), new ai.y1(z1Var, 26));
        } else if (q61Var.f17129a == 16 && (q61Var.G instanceof b2)) {
            if (!z1Var.f11467b.isEmpty()) {
                z1Var.e0(q61Var, view);
                return;
            }
            b2 b2Var = (b2) q61Var.G;
            if (!b2Var.f11179g) {
                Bundle f7 = org.telegram.ui.Cells.c1.f(5, "chatMode");
                f7.putLong("user_id", z1Var.getUserConfig().getClientUserId());
                f7.putString("quick_reply", b2Var.f11175b);
                zn znVar = new zn(f7);
                znVar.rb(b2Var.f11174a);
                z1Var.presentFragment(znVar);
            }
        }
    }

    public static void X(z1 z1Var) {
        z1Var.f11467b.clear();
        AndroidUtilities.forEachViews((RecyclerView) z1Var.f11466a, (Utilities.Callback<View>) new ai.i(4));
        z1Var.actionBar.s();
        z1Var.f11466a.x1(false);
    }

    public static int c0(z1 z1Var) {
        return z1Var.currentAccount;
    }

    public static void d0(Activity activity, int i10, String str, b2 b2Var, e6 e6Var, Utilities.Callback callback) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        int i11;
        CharSequence charSequence;
        int i12;
        n2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        if (R != null && (R.getFragmentView() instanceof tw0) && ((tw0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, e6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, e6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        if (b2Var == null && str == null) {
            i11 = R.string.BusinessRepliesNewTitle;
        } else {
            i11 = R.string.BusinessRepliesEditTitle;
        }
        String string = LocaleController.getString(i11);
        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20378a;
        b2Var2.R = string;
        final s1 s1Var = new s1(activity, e6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        s1Var.setTextSize(1, 18.0f);
        if (b2Var == null) {
            if (str == null) {
                charSequence = "";
            } else {
                charSequence = str;
            }
        } else {
            charSequence = b2Var.f11175b;
        }
        s1Var.setText(charSequence);
        int i13 = i6.f20909j5;
        s1Var.setTextColor(i6.w0(i13, e6Var));
        s1Var.setHintColor(i6.w0(i6.Xh, e6Var));
        s1Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        s1Var.setSingleLine(true);
        s1Var.setFocusable(true);
        s1Var.setLineColors(i6.w0(i6.f20929k6, e6Var), i6.w0(i6.f20947l6, e6Var), i6.w0(i6.f21022p7, e6Var));
        s1Var.setImeOptions(6);
        s1Var.setBackgroundDrawable(null);
        s1Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        s1Var.setFilters(new InputFilter[]{new Object()});
        LinearLayout e7 = org.telegram.messenger.q.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        bi.o(i13, e6Var, textView, 1, 16.0f);
        if (b2Var == null && str == null) {
            i12 = R.string.BusinessRepliesNewMessage;
        } else {
            i12 = R.string.BusinessRepliesEditMessage;
        }
        textView.setText(LocaleController.getString(i12));
        frameLayout.addView(textView, x5.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        bi.o(i6.f21041q7, e6Var, textView2, 1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, x5.e(-1, -2, 83));
        f4 f4Var = new f4(r15, new ValueAnimator[1], textView2, textView, 3);
        Runnable[] runnableArr = {new rc(f4Var, 24)};
        s1Var.addTextChangedListener(new u1(textView2, runnableArr));
        e7.addView(frameLayout, x5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e7.addView(s1Var, x5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(e7);
        b2Var2.f20411a = AndroidUtilities.dp(292.0f);
        s1Var.setOnEditorActionListener(new v1(s1Var, i10, b2Var, textView2, f4Var, callback, b2VarArr, view));
        alertDialog$Builder2.k(LocaleController.getString(R.string.Done), new n1(s1Var, f4Var, i10, b2Var, textView2, callback));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new o1(0));
        if (z10) {
            h = b2Var2;
            b2VarArr[0] = b2Var2;
            b2Var2.setOnDismissListener(new r(1, view));
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
            b2Var2.O = new ai.y1(s1Var, 27);
            b2VarArr[0] = b2Var2;
            b2Var2.setOnDismissListener(new g5(s1Var, 3));
            b2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
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
            b2VarArr[0].show();
        }
        b2VarArr[0].f20425h0 = false;
        s1Var.setSelection(s1Var.getText().length());
    }

    @Override
    public final View createView(Context context) {
        c.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new q1(this));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(getParentActivity());
        this.f11468c = numberTextView;
        numberTextView.setTextSize(18);
        this.f11468c.setTypeface(AndroidUtilities.bold());
        this.f11468c.setTextColor(i6.x0(null, i6.f21187y8, false));
        j3.addView(this.f11468c, x5.m(1.0f, 0, -1, 72, 0, 0));
        this.f11468c.setOnTouchListener(new bi.d(2));
        org.telegram.ui.ActionBar.v0 a2 = j3.a(1, R.drawable.msg_edit);
        this.d = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        j3.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        r1 r1Var = new r1(context, null, 0);
        r1Var.setBackgroundColor(i6.x0(null, i6.f20745a7, false));
        l71 l71Var = new l71(this, new Utilities.Callback2(this) {
            public final z1 f11312b;

            {
                this.f11312b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        z1.V(this.f11312b, (ArrayList) obj, (d71) obj2);
                        return;
                    default:
                        z1.U(this.f11312b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, new m1(this), new m1(this));
        this.f11466a = l71Var;
        l71Var.p1();
        l71 l71Var2 = this.f11466a;
        l71Var2.W2.f25587r = false;
        l71Var2.C1(new Utilities.Callback2(this) {
            public final z1 f11312b;

            {
                this.f11312b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        z1.V(this.f11312b, (ArrayList) obj, (d71) obj2);
                        return;
                    default:
                        z1.U(this.f11312b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                }
            }
        }, false);
        r1Var.addView(this.f11466a, x5.d(-1.0f, -1));
        this.actionBar.B(this.f11466a, true);
        this.fragmentView = r1Var;
        return r1Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        l71 l71Var;
        d71 d71Var;
        if (i10 == NotificationCenter.quickRepliesUpdated && (l71Var = this.f11466a) != null && (d71Var = l71Var.W2) != null) {
            d71Var.N(true);
        }
    }

    public final void e0(q61 q61Var, View view) {
        boolean z10;
        float f7;
        float f10;
        b2 b2Var = (b2) q61Var.G;
        y1 y1Var = (y1) view;
        Integer valueOf = Integer.valueOf(b2Var.f11174a);
        ArrayList arrayList = this.f11467b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(b2Var.f11174a));
        } else {
            arrayList.add(Integer.valueOf(b2Var.f11174a));
        }
        boolean z11 = true;
        this.f11466a.x1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(b2Var.f11174a));
        q61Var.f30057e = contains;
        y1Var.d.a(contains, true);
        if (this.actionBar.t() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.actionBar.s();
            } else {
                this.actionBar.O(null, null);
            }
        }
        this.f11468c.a(Math.max(1, arrayList.size()), true);
        if (arrayList.size() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            b2 c10 = c2.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            if (c10 == null || c2.g(c10.f11175b)) {
                z11 = false;
            }
            z10 = z11;
        }
        if (this.f11470f != z10) {
            this.f11470f = z10;
            ViewPropertyAnimator animate = this.d.animate();
            float f11 = 1.0f;
            if (this.f11470f) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
            if (this.f11470f) {
                f10 = 1.0f;
            } else {
                f10 = 0.7f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (!this.f11470f) {
                f11 = 0.7f;
            }
            bi.t(scaleX.scaleY(f11), is.h, 340L);
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
        this.f11466a.setPadding(0, 0, 0, i13);
        this.f11466a.setClipToPadding(false);
    }
}

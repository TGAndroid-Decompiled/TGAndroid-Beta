package jg;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bi.cb;
import di.d6;
import di.y2;
import fi.ua;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.j2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;
public final class z1 extends r2 implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.e2 f15913f;
    public r71 f15914a;
    public final ArrayList f15915b;
    public y5 f15916c;
    public int d;
    public boolean e;

    public z1() {
        super(null);
        this.f15915b = new ArrayList();
        this.e = true;
    }

    public static void V(z1 z1Var, int i10, ArrayList arrayList) {
        if (i10 == z1Var.d) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((t61) arrayList.get(i11)).G instanceof b2) {
                    ((b2) ((t61) arrayList.get(i11)).G).f15642c = i11;
                }
            }
            c2 f7 = c2.f(z1Var.currentAccount);
            ArrayList arrayList2 = f7.f15660b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = c3.h0.i(((b2) arrayList2.get(i12)).f15640a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new a4.d(24));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((b2) arrayList2.get(i13)).f15640a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = c3.h0.i(((b2) arrayList2.get(i14)).f15640a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f7.f15659a).sendRequest(tL_messages_reorderQuickReplies, new d6(5));
                    f7.l();
                    return;
                }
            }
        }
    }

    public static void W(z1 z1Var, ArrayList arrayList, j71 j71Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        t61 t61Var = new t61(2);
        t61Var.f32875l = string;
        t61Var.f32878o = string2;
        t61Var.f32876m = "RestrictedEmoji";
        t61Var.f32877n = "📝";
        arrayList.add(t61Var);
        j71Var.V();
        c2 f7 = c2.f(z1Var.currentAccount);
        ArrayList arrayList2 = f7.f15660b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            if (i11 == 0 && !"hello".equalsIgnoreCase(((b2) arrayList2.get(i13)).f15641b)) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            if (i12 == 0 && !"away".equalsIgnoreCase(((b2) arrayList2.get(i13)).f15641b)) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            if (i11 != 0 && i12 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i11 ^ 1) + (i12 ^ 1) < MessagesController.getInstance(f7.f15659a).quickRepliesLimit) {
            t61 c10 = t61.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c10.f32880q = true;
            arrayList.add(c10);
        }
        z1Var.d = j71Var.M();
        ArrayList arrayList3 = c2.f(z1Var.currentAccount).f15660b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            b2 b2Var = (b2) obj;
            t61 t61Var2 = new t61(16);
            t61Var2.G = b2Var;
            t61Var2.L(z1Var.f15915b.contains(Integer.valueOf(b2Var.f15640a)));
            arrayList.add(t61Var2);
        }
        j71Var.L();
        j71Var.U();
        ic.a.z(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void X(z1 z1Var, t61 t61Var, View view) {
        if (t61Var.d == 1) {
            e0(z1Var.getParentActivity(), z1Var.currentAccount, null, null, z1Var.getResourceProvider(), new ig.o(z1Var, 6));
        } else if (t61Var.f47040a == 16 && (t61Var.G instanceof b2)) {
            if (!z1Var.f15915b.isEmpty()) {
                z1Var.f0(t61Var, view);
                return;
            }
            b2 b2Var = (b2) t61Var.G;
            if (!b2Var.f15644g) {
                Bundle g7 = b10.g(5, "chatMode");
                g7.putLong("user_id", z1Var.getUserConfig().getClientUserId());
                g7.putString("quick_reply", b2Var.f15641b);
                un unVar = new un(g7);
                unVar.yb(b2Var.f15640a);
                z1Var.presentFragment(unVar);
            }
        }
    }

    public static void Y(z1 z1Var) {
        z1Var.f15915b.clear();
        AndroidUtilities.forEachViews((RecyclerView) z1Var.f15914a, (Utilities.Callback<View>) new di.e(4));
        z1Var.simpleActionBar.n();
        z1Var.f15914a.C1(false);
    }

    public static void e0(Activity activity, int i10, String str, b2 b2Var, u6 u6Var, Utilities.Callback callback) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        int i11;
        CharSequence charSequence;
        int i12;
        ?? r32;
        r2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        if (R != null && (R.getFragmentView() instanceof vw0) && ((vw0) R.getFragmentView()).Q() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.e2[] e2VarArr = new org.telegram.ui.ActionBar.e2[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, u6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(activity, 0, u6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        if (b2Var == null && str == null) {
            i11 = R.string.BusinessRepliesNewTitle;
        } else {
            i11 = R.string.BusinessRepliesEditTitle;
        }
        String string = LocaleController.getString(i11);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder2.f22368a;
        e2Var.R = string;
        final s1 s1Var = new s1(activity, u6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        s1Var.setTextSize(1, 18.0f);
        if (b2Var == null) {
            if (str == null) {
                charSequence = "";
            } else {
                charSequence = str;
            }
        } else {
            charSequence = b2Var.f15641b;
        }
        s1Var.setText(charSequence);
        int i13 = y6.f23464j5;
        f7.V(s1Var, i13, u6Var);
        f7.m(s1Var, 34, y6.Xh, u6Var);
        s1Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        s1Var.setSingleLine(true);
        s1Var.setFocusable(true);
        f7.G(s1Var, y6.f23484k6, y6.f23502l6, y6.f23581p7, u6Var);
        s1Var.setImeOptions(6);
        s1Var.setBackgroundDrawable(null);
        s1Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        s1Var.setFilters(new InputFilter[]{new Object()});
        LinearLayout f7 = org.telegram.messenger.t.f(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        f7.V(textView, i13, u6Var);
        textView.setTextSize(1, 16.0f);
        if (b2Var == null && str == null) {
            i12 = R.string.BusinessRepliesNewMessage;
        } else {
            i12 = R.string.BusinessRepliesEditMessage;
        }
        textView.setText(LocaleController.getString(i12));
        frameLayout.addView(textView, gb1.i(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        f7.V(textView2, y6.f23598q7, u6Var);
        textView2.setTextSize(1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, gb1.i(-1, -2, 83));
        y2 y2Var = new y2(r4, new ValueAnimator[1], textView2, textView, 3);
        Runnable[] runnableArr = {new ua(y2Var, 28)};
        s1Var.addTextChangedListener(new u1(textView2, runnableArr));
        f7.addView(frameLayout, gb1.o(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f7.addView(s1Var, gb1.o(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.o(f7);
        e2Var.f22555a = AndroidUtilities.dp(292.0f);
        s1Var.setOnEditorActionListener(new v1(s1Var, i10, b2Var, textView2, y2Var, callback, e2VarArr, view));
        alertDialog$Builder2.k(LocaleController.getString(R.string.Done), new o1(s1Var, y2Var, i10, b2Var, textView2, callback));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new j2.d(28));
        if (z10) {
            f15913f = e2Var;
            e2VarArr[0] = e2Var;
            e2Var.setOnDismissListener(new r(1, view));
            r32 = 0;
            f15913f.setOnShowListener(new DialogInterface.OnShowListener() {
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
            f15913f.r(250L);
        } else {
            r32 = 0;
            e2Var.O = new ig.o(s1Var, 7);
            e2VarArr[0] = e2Var;
            e2Var.setOnDismissListener(new cb(s1Var, 6));
            e2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
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
            e2VarArr[0].show();
        }
        e2VarArr[r32].f22577j0 = r32;
        s1Var.setSelection(s1Var.getText().length());
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new j2(false));
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.simpleActionBar.setActionBarMenuOnItemClick(new q1(this));
        x5 h = this.simpleActionBar.h();
        y5 a2 = h.a(1, R.drawable.msg_edit);
        this.f15916c = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        h.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        r1 r1Var = new r1(context, null, 0);
        r71 r71Var = new r71(this, new Utilities.Callback2(this) {
            public final z1 f15792b;

            {
                this.f15792b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        z1.V(this.f15792b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                    default:
                        z1.W(this.f15792b, (ArrayList) obj, (j71) obj2);
                        return;
                }
            }
        }, new m1(this), new m1(this));
        this.f15914a = r71Var;
        r71Var.u1();
        this.f15914a.setSectionsDrawBackground(true);
        r71 r71Var2 = this.f15914a;
        r71Var2.f32152g3.f29507r = false;
        r71Var2.H1(new Utilities.Callback2(this) {
            public final z1 f15792b;

            {
                this.f15792b = this;
            }

            @Override
            public final void run(Object obj, Object obj2) {
                switch (r2) {
                    case 0:
                        z1.V(this.f15792b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        return;
                    default:
                        z1.W(this.f15792b, (ArrayList) obj, (j71) obj2);
                        return;
                }
            }
        }, false);
        r1Var.addView(this.f15914a, gb1.g(-1.0f, -1));
        this.fragmentView = r1Var;
        return r1Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        r71 r71Var;
        j71 j71Var;
        if (i10 == NotificationCenter.quickRepliesUpdated && (r71Var = this.f15914a) != null && (j71Var = r71Var.f32152g3) != null) {
            j71Var.O(true);
        }
    }

    public final void f0(t61 t61Var, View view) {
        boolean z10;
        b2 b2Var = (b2) t61Var.G;
        y1 y1Var = (y1) view;
        Integer valueOf = Integer.valueOf(b2Var.f15640a);
        ArrayList arrayList = this.f15915b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(b2Var.f15640a));
        } else {
            arrayList.add(Integer.valueOf(b2Var.f15640a));
        }
        this.f15914a.C1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(b2Var.f15640a));
        t61Var.e = contains;
        y1Var.d.a(contains, true);
        if (this.simpleActionBar.o() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.simpleActionBar.n();
            } else {
                this.simpleActionBar.x();
            }
        }
        this.simpleActionBar.t(Math.max(1, arrayList.size()), true);
        boolean z11 = false;
        if (arrayList.size() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            b2 c10 = c2.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            if (c10 != null && !c2.g(c10.f15641b)) {
                z11 = true;
            }
            z10 = z11;
        }
        if (this.e != z10) {
            this.e = z10;
            this.f15916c.Y(z10, true);
        }
    }

    @Override
    public final mm0 getListViewForSimpleGlass() {
        return this.f15914a;
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
    public final boolean useSimpleActionBar() {
        return true;
    }
}

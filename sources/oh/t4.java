package oh;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.xr;
public final class t4 extends xr {
    public final u4 f17768c;

    public t4(u4 u4Var, Context context, b bVar) {
        super(context, bVar, false);
        this.f17768c = u4Var;
    }

    @Override
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.d(0.18f, -16777216, -1));
        u4 u4Var = this.f17768c;
        e5 e5Var = u4Var.f17820x;
        d5 d5Var = e5Var.B;
        if (d5Var != null && d5Var.f16976f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            i10 = R.drawable.menu_views_reposts;
        } else if (e5Var.L.f17657a) {
            i10 = R.drawable.menu_views_reactions2;
        } else {
            i10 = R.drawable.menu_views_reactions;
        }
        int i14 = i10;
        if (z4) {
            i11 = R.string.SortByReposts;
        } else {
            i11 = R.string.SortByReactions;
        }
        org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i14, LocaleController.getString(i11), false, e5Var.f17034s);
        if (!e5Var.L.f17657a) {
            c3.setAlpha(0.5f);
        }
        c3.setOnClickListener(new View.OnClickListener(this) {
            public final t4 f17734b;

            {
                this.f17734b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e5 e5Var2 = this.f17734b.f17768c.f17820x;
                        q4 q4Var = e5Var2.L;
                        if (!q4Var.f17657a) {
                            q4 q4Var2 = e5Var2.J;
                            if (q4Var2 != null) {
                                q4Var.f17657a = true;
                                q4Var2.f17657a = true;
                            } else {
                                q4Var.f17657a = true;
                            }
                            e5Var2.h(true);
                            e5.b(e5Var2);
                            e5Var2.K.accept(e5Var2);
                        }
                        t4 t4Var = e5Var2.f17031f;
                        if (t4Var != null) {
                            t4Var.a();
                            return;
                        }
                        return;
                    default:
                        e5 e5Var3 = this.f17734b.f17768c.f17820x;
                        q4 q4Var3 = e5Var3.L;
                        if (q4Var3.f17657a) {
                            q4 q4Var4 = e5Var3.J;
                            if (q4Var4 != null) {
                                q4Var3.f17657a = false;
                                q4Var4.f17657a = false;
                            } else {
                                q4Var3.f17657a = false;
                            }
                            e5Var3.h(true);
                            e5.b(e5Var3);
                            e5Var3.K.accept(e5Var3);
                        }
                        t4 t4Var2 = e5Var3.f17031f;
                        if (t4Var2 != null) {
                            t4Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        if (!e5Var.L.f17657a) {
            i12 = R.drawable.menu_views_recent2;
        } else {
            i12 = R.drawable.menu_views_recent;
        }
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i12, LocaleController.getString(R.string.SortByTime), false, e5Var.f17034s);
        if (e5Var.L.f17657a) {
            c10.setAlpha(0.5f);
        }
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final t4 f17734b;

            {
                this.f17734b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e5 e5Var2 = this.f17734b.f17768c.f17820x;
                        q4 q4Var = e5Var2.L;
                        if (!q4Var.f17657a) {
                            q4 q4Var2 = e5Var2.J;
                            if (q4Var2 != null) {
                                q4Var.f17657a = true;
                                q4Var2.f17657a = true;
                            } else {
                                q4Var.f17657a = true;
                            }
                            e5Var2.h(true);
                            e5.b(e5Var2);
                            e5Var2.K.accept(e5Var2);
                        }
                        t4 t4Var = e5Var2.f17031f;
                        if (t4Var != null) {
                            t4Var.a();
                            return;
                        }
                        return;
                    default:
                        e5 e5Var3 = this.f17734b.f17768c.f17820x;
                        q4 q4Var3 = e5Var3.L;
                        if (q4Var3.f17657a) {
                            q4 q4Var4 = e5Var3.J;
                            if (q4Var4 != null) {
                                q4Var3.f17657a = false;
                                q4Var4.f17657a = false;
                            } else {
                                q4Var3.f17657a = false;
                            }
                            e5Var3.h(true);
                            e5.b(e5Var3);
                            e5Var3.K.accept(e5Var3);
                        }
                        t4 t4Var2 = e5Var3.f17031f;
                        if (t4Var2 != null) {
                            t4Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        View m1Var = new org.telegram.ui.ActionBar.m1(u4Var.getContext(), org.telegram.ui.ActionBar.k6.H8, e5Var.f17034s);
        m1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(m1Var, k7.c6.n(-1, 8));
        if (z4) {
            i13 = R.string.StoryReactionsSortDescription;
        } else {
            i13 = R.string.StoryViewsSortDescription;
        }
        String string = LocaleController.getString(i13);
        b bVar = e5Var.f17034s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21768j5, bVar));
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setText(string);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(AndroidUtilities.dp(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, k7.c6.n(-1, -2));
    }

    @Override
    public final void c() {
    }
}

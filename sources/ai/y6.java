package ai;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ns;
public final class y6 extends ns {
    public final z6 f1948c;

    public y6(z6 z6Var, Context context, d dVar) {
        super(context, dVar, false);
        this.f1948c = z6Var;
    }

    @Override
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.d(0.18f, -16777216, -1));
        z6 z6Var = this.f1948c;
        l7 l7Var = z6Var.f2016x;
        k7 k7Var = l7Var.E;
        if (k7Var != null && k7Var.f1231f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = R.drawable.menu_views_reposts;
        } else if (l7Var.O.f1825a) {
            i10 = R.drawable.menu_views_reactions2;
        } else {
            i10 = R.drawable.menu_views_reactions;
        }
        int i14 = i10;
        if (z10) {
            i11 = R.string.SortByReposts;
        } else {
            i11 = R.string.SortByReactions;
        }
        org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i14, LocaleController.getString(i11), false, l7Var.f1341s);
        if (!l7Var.O.f1825a) {
            c10.setAlpha(0.5f);
        }
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final y6 f1909b;

            {
                this.f1909b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l7 l7Var2 = this.f1909b.f1948c.f2016x;
                        v6 v6Var = l7Var2.O;
                        if (!v6Var.f1825a) {
                            v6 v6Var2 = l7Var2.M;
                            if (v6Var2 != null) {
                                v6Var.f1825a = true;
                                v6Var2.f1825a = true;
                            } else {
                                v6Var.f1825a = true;
                            }
                            l7Var2.h(true);
                            l7.b(l7Var2);
                            l7Var2.N.run(l7Var2);
                        }
                        y6 y6Var = l7Var2.f1338f;
                        if (y6Var != null) {
                            y6Var.a();
                            return;
                        }
                        return;
                    default:
                        l7 l7Var3 = this.f1909b.f1948c.f2016x;
                        v6 v6Var3 = l7Var3.O;
                        if (v6Var3.f1825a) {
                            v6 v6Var4 = l7Var3.M;
                            if (v6Var4 != null) {
                                v6Var3.f1825a = false;
                                v6Var4.f1825a = false;
                            } else {
                                v6Var3.f1825a = false;
                            }
                            l7Var3.h(true);
                            l7.b(l7Var3);
                            l7Var3.N.run(l7Var3);
                        }
                        y6 y6Var2 = l7Var3.f1338f;
                        if (y6Var2 != null) {
                            y6Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        if (!l7Var.O.f1825a) {
            i12 = R.drawable.menu_views_recent2;
        } else {
            i12 = R.drawable.menu_views_recent;
        }
        org.telegram.ui.ActionBar.f1 c11 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i12, LocaleController.getString(R.string.SortByTime), false, l7Var.f1341s);
        if (l7Var.O.f1825a) {
            c11.setAlpha(0.5f);
        }
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final y6 f1909b;

            {
                this.f1909b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l7 l7Var2 = this.f1909b.f1948c.f2016x;
                        v6 v6Var = l7Var2.O;
                        if (!v6Var.f1825a) {
                            v6 v6Var2 = l7Var2.M;
                            if (v6Var2 != null) {
                                v6Var.f1825a = true;
                                v6Var2.f1825a = true;
                            } else {
                                v6Var.f1825a = true;
                            }
                            l7Var2.h(true);
                            l7.b(l7Var2);
                            l7Var2.N.run(l7Var2);
                        }
                        y6 y6Var = l7Var2.f1338f;
                        if (y6Var != null) {
                            y6Var.a();
                            return;
                        }
                        return;
                    default:
                        l7 l7Var3 = this.f1909b.f1948c.f2016x;
                        v6 v6Var3 = l7Var3.O;
                        if (v6Var3.f1825a) {
                            v6 v6Var4 = l7Var3.M;
                            if (v6Var4 != null) {
                                v6Var3.f1825a = false;
                                v6Var4.f1825a = false;
                            } else {
                                v6Var3.f1825a = false;
                            }
                            l7Var3.h(true);
                            l7.b(l7Var3);
                            l7Var3.N.run(l7Var3);
                        }
                        y6 y6Var2 = l7Var3.f1338f;
                        if (y6Var2 != null) {
                            y6Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        View k1Var = new org.telegram.ui.ActionBar.k1(z6Var.getContext(), org.telegram.ui.ActionBar.i6.H8, l7Var.f1341s);
        k1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(k1Var, w7.x5.n(-1, 8));
        if (z10) {
            i13 = R.string.StoryReactionsSortDescription;
        } else {
            i13 = R.string.StoryViewsSortDescription;
        }
        String string = LocaleController.getString(i13);
        d dVar = l7Var.f1341s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20905j5, dVar));
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setText(string);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(AndroidUtilities.dp(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, w7.x5.n(-1, -2));
    }

    @Override
    public final void c() {
    }
}

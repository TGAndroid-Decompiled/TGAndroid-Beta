package bi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.wr;
public final class g6 extends wr {
    public final h6 f3023c;

    public g6(h6 h6Var, Context context, b bVar) {
        super(context, bVar, false);
        this.f3023c = h6Var;
    }

    @Override
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.d(0.18f, -16777216, -1));
        h6 h6Var = this.f3023c;
        s6 s6Var = h6Var.f3064x;
        r6 r6Var = s6Var.E;
        if (r6Var != null && r6Var.f3644f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = R.drawable.menu_views_reposts;
        } else if (s6Var.O.f2863a) {
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
        org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i14, LocaleController.getString(i11), false, s6Var.f3697s);
        if (!s6Var.O.f2863a) {
            c10.setAlpha(0.5f);
        }
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final g6 f2974b;

            {
                this.f2974b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        s6 s6Var2 = this.f2974b.f3023c.f3064x;
                        d6 d6Var = s6Var2.O;
                        if (!d6Var.f2863a) {
                            d6 d6Var2 = s6Var2.M;
                            if (d6Var2 != null) {
                                d6Var.f2863a = true;
                                d6Var2.f2863a = true;
                            } else {
                                d6Var.f2863a = true;
                            }
                            s6Var2.h(true);
                            s6.b(s6Var2);
                            s6Var2.N.accept(s6Var2);
                        }
                        g6 g6Var = s6Var2.f3694f;
                        if (g6Var != null) {
                            g6Var.a();
                            return;
                        }
                        return;
                    default:
                        s6 s6Var3 = this.f2974b.f3023c.f3064x;
                        d6 d6Var3 = s6Var3.O;
                        if (d6Var3.f2863a) {
                            d6 d6Var4 = s6Var3.M;
                            if (d6Var4 != null) {
                                d6Var3.f2863a = false;
                                d6Var4.f2863a = false;
                            } else {
                                d6Var3.f2863a = false;
                            }
                            s6Var3.h(true);
                            s6.b(s6Var3);
                            s6Var3.N.accept(s6Var3);
                        }
                        g6 g6Var2 = s6Var3.f3694f;
                        if (g6Var2 != null) {
                            g6Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        if (!s6Var.O.f2863a) {
            i12 = R.drawable.menu_views_recent2;
        } else {
            i12 = R.drawable.menu_views_recent;
        }
        org.telegram.ui.ActionBar.f1 c11 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i12, LocaleController.getString(R.string.SortByTime), false, s6Var.f3697s);
        if (s6Var.O.f2863a) {
            c11.setAlpha(0.5f);
        }
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final g6 f2974b;

            {
                this.f2974b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        s6 s6Var2 = this.f2974b.f3023c.f3064x;
                        d6 d6Var = s6Var2.O;
                        if (!d6Var.f2863a) {
                            d6 d6Var2 = s6Var2.M;
                            if (d6Var2 != null) {
                                d6Var.f2863a = true;
                                d6Var2.f2863a = true;
                            } else {
                                d6Var.f2863a = true;
                            }
                            s6Var2.h(true);
                            s6.b(s6Var2);
                            s6Var2.N.accept(s6Var2);
                        }
                        g6 g6Var = s6Var2.f3694f;
                        if (g6Var != null) {
                            g6Var.a();
                            return;
                        }
                        return;
                    default:
                        s6 s6Var3 = this.f2974b.f3023c.f3064x;
                        d6 d6Var3 = s6Var3.O;
                        if (d6Var3.f2863a) {
                            d6 d6Var4 = s6Var3.M;
                            if (d6Var4 != null) {
                                d6Var3.f2863a = false;
                                d6Var4.f2863a = false;
                            } else {
                                d6Var3.f2863a = false;
                            }
                            s6Var3.h(true);
                            s6.b(s6Var3);
                            s6Var3.N.accept(s6Var3);
                        }
                        g6 g6Var2 = s6Var3.f3694f;
                        if (g6Var2 != null) {
                            g6Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        View k1Var = new org.telegram.ui.ActionBar.k1(h6Var.getContext(), org.telegram.ui.ActionBar.j6.H8, s6Var.f3697s);
        k1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(k1Var, w7.x5.n(-1, 8));
        if (z10) {
            i13 = R.string.StoryReactionsSortDescription;
        } else {
            i13 = R.string.StoryViewsSortDescription;
        }
        String string = LocaleController.getString(i13);
        b bVar = s6Var.f3697s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20770j5, bVar));
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

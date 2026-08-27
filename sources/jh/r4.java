package jh;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.lr;

public final class r4 extends lr {

    public final s4 f13901c;

    public r4(s4 s4Var, Context context, b bVar) {
        super(context, bVar, false);
        this.f13901c = s4Var;
    }

    @Override
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        int i10;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.b.d(0.18f, -16777216, -1));
        s4 s4Var = this.f13901c;
        c5 c5Var = s4Var.f13950x;
        b5 b5Var = c5Var.A;
        boolean z10 = b5Var != null && b5Var.f13105f;
        if (z10) {
            i10 = R.drawable.menu_views_reposts;
        } else {
            i10 = c5Var.K.f13745a ? R.drawable.menu_views_reactions2 : R.drawable.menu_views_reactions;
        }
        org.telegram.ui.ActionBar.f1 f1VarC = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i10, LocaleController.getString(z10 ? R.string.SortByReposts : R.string.SortByReactions), false, c5Var.f13157s);
        if (!c5Var.K.f13745a) {
            f1VarC.setAlpha(0.5f);
        }
        final int i11 = 0;
        f1VarC.setOnClickListener(new View.OnClickListener(this) {

            public final r4 f13855b;

            {
                this.f13855b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        c5 c5Var2 = this.f13855b.f13901c.f13950x;
                        o4 o4Var = c5Var2.K;
                        if (!o4Var.f13745a) {
                            o4 o4Var2 = c5Var2.I;
                            if (o4Var2 != null) {
                                o4Var.f13745a = true;
                                o4Var2.f13745a = true;
                            } else {
                                o4Var.f13745a = true;
                            }
                            c5Var2.h(true);
                            c5.b(c5Var2);
                            c5Var2.J.accept(c5Var2);
                        }
                        r4 r4Var = c5Var2.f13154f;
                        if (r4Var != null) {
                            r4Var.a();
                        }
                        break;
                    default:
                        c5 c5Var3 = this.f13855b.f13901c.f13950x;
                        o4 o4Var3 = c5Var3.K;
                        if (o4Var3.f13745a) {
                            o4 o4Var4 = c5Var3.I;
                            if (o4Var4 != null) {
                                o4Var3.f13745a = false;
                                o4Var4.f13745a = false;
                            } else {
                                o4Var3.f13745a = false;
                            }
                            c5Var3.h(true);
                            c5.b(c5Var3);
                            c5Var3.J.accept(c5Var3);
                        }
                        r4 r4Var2 = c5Var3.f13154f;
                        if (r4Var2 != null) {
                            r4Var2.a();
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.f1 f1VarC2 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !c5Var.K.f13745a ? R.drawable.menu_views_recent2 : R.drawable.menu_views_recent, LocaleController.getString(R.string.SortByTime), false, c5Var.f13157s);
        if (c5Var.K.f13745a) {
            f1VarC2.setAlpha(0.5f);
        }
        final int i12 = 1;
        f1VarC2.setOnClickListener(new View.OnClickListener(this) {

            public final r4 f13855b;

            {
                this.f13855b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        c5 c5Var2 = this.f13855b.f13901c.f13950x;
                        o4 o4Var = c5Var2.K;
                        if (!o4Var.f13745a) {
                            o4 o4Var2 = c5Var2.I;
                            if (o4Var2 != null) {
                                o4Var.f13745a = true;
                                o4Var2.f13745a = true;
                            } else {
                                o4Var.f13745a = true;
                            }
                            c5Var2.h(true);
                            c5.b(c5Var2);
                            c5Var2.J.accept(c5Var2);
                        }
                        r4 r4Var = c5Var2.f13154f;
                        if (r4Var != null) {
                            r4Var.a();
                        }
                        break;
                    default:
                        c5 c5Var3 = this.f13855b.f13901c.f13950x;
                        o4 o4Var3 = c5Var3.K;
                        if (o4Var3.f13745a) {
                            o4 o4Var4 = c5Var3.I;
                            if (o4Var4 != null) {
                                o4Var3.f13745a = false;
                                o4Var4.f13745a = false;
                            } else {
                                o4Var3.f13745a = false;
                            }
                            c5Var3.h(true);
                            c5.b(c5Var3);
                            c5Var3.J.accept(c5Var3);
                        }
                        r4 r4Var2 = c5Var3.f13154f;
                        if (r4Var2 != null) {
                            r4Var2.a();
                        }
                        break;
                }
            }
        });
        View k1Var = new org.telegram.ui.ActionBar.k1(s4Var.getContext(), org.telegram.ui.ActionBar.g6.H8, c5Var.f13157s);
        k1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(k1Var, h7.z5.n(-1, 8));
        String string = LocaleController.getString(z10 ? R.string.StoryReactionsSortDescription : R.string.StoryViewsSortDescription);
        b bVar = c5Var.f13157s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23161j5, bVar));
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setText(string);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(AndroidUtilities.dp(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, h7.z5.n(-1, -2));
    }

    @Override
    public final void c() {
    }
}

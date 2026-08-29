package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f13203a;
    public final a f13204b;

    public e(Context context, a aVar) {
        this.f13203a = context;
        this.f13204b = aVar;
    }

    @Override
    public final void finish() {
        this.f13204b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f13204b.b();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f13203a, this.f13204b.c());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f13204b.d();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f13204b.e();
    }

    @Override
    public final Object getTag() {
        return this.f13204b.f13194a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f13204b.f();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f13204b.f13195b;
    }

    @Override
    public final void invalidate() {
        this.f13204b.g();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f13204b.h();
    }

    @Override
    public final void setCustomView(View view) {
        this.f13204b.j(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f13204b.l(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f13204b.f13194a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f13204b.n(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f13204b.o(z10);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f13204b.k(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f13204b.m(i10);
    }
}

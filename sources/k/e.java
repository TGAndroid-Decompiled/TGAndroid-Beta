package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f17114a;
    public final a f17115b;

    public e(Context context, a aVar) {
        this.f17114a = context;
        this.f17115b = aVar;
    }

    @Override
    public final void finish() {
        this.f17115b.b();
    }

    @Override
    public final View getCustomView() {
        return this.f17115b.c();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f17114a, this.f17115b.d());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f17115b.e();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f17115b.f();
    }

    @Override
    public final Object getTag() {
        return this.f17115b.f17106b;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f17115b.g();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f17115b.f17105a;
    }

    @Override
    public final void invalidate() {
        this.f17115b.h();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f17115b.i();
    }

    @Override
    public final void setCustomView(View view) {
        this.f17115b.l(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f17115b.n(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f17115b.f17106b = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f17115b.p(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z9) {
        this.f17115b.q(z9);
    }

    @Override
    public final void setSubtitle(int i7) {
        this.f17115b.m(i7);
    }

    @Override
    public final void setTitle(int i7) {
        this.f17115b.o(i7);
    }
}

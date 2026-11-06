package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f17111a;
    public final a f17112b;

    public e(Context context, a aVar) {
        this.f17111a = context;
        this.f17112b = aVar;
    }

    @Override
    public final void finish() {
        this.f17112b.b();
    }

    @Override
    public final View getCustomView() {
        return this.f17112b.c();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f17111a, this.f17112b.d());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f17112b.e();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f17112b.f();
    }

    @Override
    public final Object getTag() {
        return this.f17112b.f17103b;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f17112b.g();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f17112b.f17102a;
    }

    @Override
    public final void invalidate() {
        this.f17112b.h();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f17112b.i();
    }

    @Override
    public final void setCustomView(View view) {
        this.f17112b.l(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f17112b.n(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f17112b.f17103b = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f17112b.p(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z9) {
        this.f17112b.q(z9);
    }

    @Override
    public final void setSubtitle(int i7) {
        this.f17112b.m(i7);
    }

    @Override
    public final void setTitle(int i7) {
        this.f17112b.o(i7);
    }
}

package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.b0;
public final class e extends ActionMode {
    public final Context f13118a;
    public final a f13119b;

    public e(Context context, a aVar) {
        this.f13118a = context;
        this.f13119b = aVar;
    }

    @Override
    public final void finish() {
        this.f13119b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f13119b.b();
    }

    @Override
    public final Menu getMenu() {
        return new b0(this.f13118a, this.f13119b.c());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f13119b.d();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f13119b.e();
    }

    @Override
    public final Object getTag() {
        return this.f13119b.f13110a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f13119b.f();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f13119b.f13111b;
    }

    @Override
    public final void invalidate() {
        this.f13119b.g();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f13119b.h();
    }

    @Override
    public final void setCustomView(View view) {
        this.f13119b.i(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f13119b.k(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f13119b.f13110a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f13119b.m(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f13119b.n(z10);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f13119b.j(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f13119b.l(i10);
    }
}

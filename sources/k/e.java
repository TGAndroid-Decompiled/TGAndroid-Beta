package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f13111a;
    public final a f13112b;

    public e(Context context, a aVar) {
        this.f13111a = context;
        this.f13112b = aVar;
    }

    @Override
    public final void finish() {
        this.f13112b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f13112b.b();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f13111a, this.f13112b.c());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f13112b.d();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f13112b.e();
    }

    @Override
    public final Object getTag() {
        return this.f13112b.f13103a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f13112b.f();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f13112b.f13104b;
    }

    @Override
    public final void invalidate() {
        this.f13112b.g();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f13112b.h();
    }

    @Override
    public final void setCustomView(View view) {
        this.f13112b.i(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f13112b.k(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f13112b.f13103a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f13112b.m(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f13112b.n(z10);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f13112b.j(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f13112b.l(i10);
    }
}

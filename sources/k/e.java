package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f13113a;
    public final a f13114b;

    public e(Context context, a aVar) {
        this.f13113a = context;
        this.f13114b = aVar;
    }

    @Override
    public final void finish() {
        this.f13114b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f13114b.b();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f13113a, this.f13114b.c());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f13114b.d();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f13114b.e();
    }

    @Override
    public final Object getTag() {
        return this.f13114b.f13105a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f13114b.f();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f13114b.f13106b;
    }

    @Override
    public final void invalidate() {
        this.f13114b.g();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f13114b.h();
    }

    @Override
    public final void setCustomView(View view) {
        this.f13114b.i(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f13114b.k(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f13114b.f13105a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f13114b.m(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f13114b.n(z10);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f13114b.j(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f13114b.l(i10);
    }
}

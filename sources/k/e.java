package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.b0;
public final class e extends ActionMode {
    public final Context f14391a;
    public final a f14392b;

    public e(Context context, a aVar) {
        this.f14391a = context;
        this.f14392b = aVar;
    }

    @Override
    public final void finish() {
        this.f14392b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f14392b.b();
    }

    @Override
    public final Menu getMenu() {
        return new b0(this.f14391a, this.f14392b.c());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f14392b.d();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f14392b.e();
    }

    @Override
    public final Object getTag() {
        return this.f14392b.f14382a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f14392b.f();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f14392b.f14383b;
    }

    @Override
    public final void invalidate() {
        this.f14392b.g();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f14392b.h();
    }

    @Override
    public final void setCustomView(View view) {
        this.f14392b.i(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f14392b.k(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f14392b.f14382a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f14392b.m(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f14392b.o(z10);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f14392b.j(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f14392b.l(i10);
    }
}

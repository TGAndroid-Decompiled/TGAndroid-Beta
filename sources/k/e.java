package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.b0;
public final class e extends ActionMode {
    public final Context f10205a;
    public final a f10206b;

    public e(Context context, a aVar) {
        this.f10205a = context;
        this.f10206b = aVar;
    }

    @Override
    public final void finish() {
        this.f10206b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f10206b.b();
    }

    @Override
    public final Menu getMenu() {
        return new b0(this.f10205a, this.f10206b.c());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f10206b.d();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f10206b.e();
    }

    @Override
    public final Object getTag() {
        return this.f10206b.f10196a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f10206b.f();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f10206b.f10197b;
    }

    @Override
    public final void invalidate() {
        this.f10206b.g();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f10206b.h();
    }

    @Override
    public final void setCustomView(View view) {
        this.f10206b.i(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f10206b.l(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f10206b.f10196a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f10206b.n(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z4) {
        this.f10206b.o(z4);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f10206b.k(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f10206b.m(i10);
    }
}

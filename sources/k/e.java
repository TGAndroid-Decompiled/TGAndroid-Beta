package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.b0;
public final class e extends ActionMode {
    public final Context f10480a;
    public final a f10481b;

    public e(Context context, a aVar) {
        this.f10480a = context;
        this.f10481b = aVar;
    }

    @Override
    public final void finish() {
        this.f10481b.b();
    }

    @Override
    public final View getCustomView() {
        return this.f10481b.c();
    }

    @Override
    public final Menu getMenu() {
        return new b0(this.f10480a, this.f10481b.d());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f10481b.e();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f10481b.f();
    }

    @Override
    public final Object getTag() {
        return this.f10481b.f10473b;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f10481b.g();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f10481b.f10472a;
    }

    @Override
    public final void invalidate() {
        this.f10481b.h();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f10481b.i();
    }

    @Override
    public final void setCustomView(View view) {
        this.f10481b.l(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f10481b.n(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f10481b.f10473b = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f10481b.q(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f10481b.r(z10);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f10481b.m(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f10481b.o(i10);
    }
}

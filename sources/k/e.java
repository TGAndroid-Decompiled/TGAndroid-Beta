package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.b0;
public final class e extends ActionMode {
    public final Context f10481a;
    public final a f10482b;

    public e(Context context, a aVar) {
        this.f10481a = context;
        this.f10482b = aVar;
    }

    @Override
    public final void finish() {
        this.f10482b.b();
    }

    @Override
    public final View getCustomView() {
        return this.f10482b.c();
    }

    @Override
    public final Menu getMenu() {
        return new b0(this.f10481a, this.f10482b.d());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f10482b.e();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f10482b.f();
    }

    @Override
    public final Object getTag() {
        return this.f10482b.f10474b;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f10482b.g();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f10482b.f10473a;
    }

    @Override
    public final void invalidate() {
        this.f10482b.h();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f10482b.i();
    }

    @Override
    public final void setCustomView(View view) {
        this.f10482b.l(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f10482b.n(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f10482b.f10474b = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f10482b.q(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f10482b.r(z10);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f10482b.m(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f10482b.o(i10);
    }
}

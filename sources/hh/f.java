package hh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import w7.x5;
public final class f extends FrameLayout {
    public final jh.f f10506a;

    public f(Context context) {
        super(context);
        ?? view = new View(context);
        this.f10506a = view;
        addView((View) view, x5.g());
    }

    public final void a(ah.c cVar, dh.e eVar) {
        jh.f fVar = this.f10506a;
        fVar.b(cVar, eVar);
        fVar.setIgnoreFastWay(true);
        fVar.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        bringChildToFront(this.f10506a);
    }
}

package gh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import w7.a6;
public final class f extends FrameLayout {
    public final ih.f f9132a;

    public f(Context context) {
        super(context);
        ?? view = new View(context);
        this.f9132a = view;
        addView((View) view, a6.g());
    }

    public final void a(zg.a aVar, ch.e eVar) {
        ih.f fVar = this.f9132a;
        fVar.b(aVar, eVar);
        fVar.setIgnoreFastWay(true);
        fVar.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        bringChildToFront(this.f9132a);
    }
}

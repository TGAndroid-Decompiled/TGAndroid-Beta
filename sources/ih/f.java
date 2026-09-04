package ih;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import w7.x5;
public final class f extends FrameLayout {
    public final kh.f f12328a;

    public f(Context context) {
        super(context);
        ?? view = new View(context);
        this.f12328a = view;
        addView((View) view, x5.g());
    }

    public final void a(bh.b bVar, eh.e eVar) {
        kh.f fVar = this.f12328a;
        fVar.b(bVar, eVar);
        fVar.setIgnoreFastWay(true);
        fVar.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        bringChildToFront(this.f12328a);
    }
}

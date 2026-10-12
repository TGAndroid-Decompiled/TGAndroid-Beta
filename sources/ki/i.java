package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.MessageObject;
public final class i extends AnimatorListenerAdapter {
    public final MessageObject.GroupedMessages.TransitionParams f14320a;

    public i(MessageObject.GroupedMessages.TransitionParams transitionParams) {
        this.f14320a = transitionParams;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        MessageObject.GroupedMessages.TransitionParams transitionParams = this.f14320a;
        transitionParams.backgroundChangeBounds = false;
        transitionParams.drawBackgroundForDeletedItems = false;
    }
}

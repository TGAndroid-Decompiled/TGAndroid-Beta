package ji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.MessageObject;
public final class i extends AnimatorListenerAdapter {
    public final MessageObject.GroupedMessages.TransitionParams f13065a;

    public i(MessageObject.GroupedMessages.TransitionParams transitionParams) {
        this.f13065a = transitionParams;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        MessageObject.GroupedMessages.TransitionParams transitionParams = this.f13065a;
        transitionParams.backgroundChangeBounds = false;
        transitionParams.drawBackgroundForDeletedItems = false;
    }
}

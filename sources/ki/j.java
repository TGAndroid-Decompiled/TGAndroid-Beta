package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.MessageObject;
public final class j extends AnimatorListenerAdapter {
    public final MessageObject.GroupedMessages.TransitionParams f15034a;

    public j(MessageObject.GroupedMessages.TransitionParams transitionParams) {
        this.f15034a = transitionParams;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        MessageObject.GroupedMessages.TransitionParams transitionParams = this.f15034a;
        transitionParams.backgroundChangeBounds = false;
        transitionParams.drawBackgroundForDeletedItems = false;
    }
}

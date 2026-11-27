package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import java.util.List;
import org.telegram.ui.ActionBar.e;
public interface wk5 {
    e getBackgroundFragment();

    nx0 getBottomSheet();

    List getFragmentStack();

    e getLastFragment();

    t37 getMessageDrawableOutMediaStart();

    t37 getMessageDrawableOutStart();

    FrameLayout getOverlayContainerView();

    Activity getParentActivity();

    List getPulledDialogs();

    e getSafeLastFragment();

    float getThemeAnimationValue();

    ViewGroup getView();

    Window getWindow();

    void setBackgroundView(View view);

    void setDelegate(sk5 sk5Var);

    void setDrawerLayoutContainer(dr3 dr3Var);

    void setFragmentPanTranslationOffset(int i);

    void setFragmentStack(List list);

    void setHighlightActionButtons(boolean z);

    void setInBubbleMode(boolean z);

    void setIsSheet(boolean z);

    void setNavigationBarColor(int i);

    void setPulledDialogs(List list);

    void setRemoveActionBarExtraHeight(boolean z);

    void setUseAlphaAnimations(boolean z);

    void setWindow(Window window);
}
